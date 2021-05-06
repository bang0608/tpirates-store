package com.tpirates.store.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tpirates.store.dao.BusinessTimeDao;
import com.tpirates.store.dao.StoreDao;
import com.tpirates.store.dto.BusinessTimeSaveRequestDto;
import com.tpirates.store.dto.StoreSaveRequestDto;


@Service
public class StoreService implements StoreDao{
	
	@Autowired
    private StoreDao storeDao;
	
	@Autowired
    private BusinessTimeService businessTimeService;
	
    private Logger logger = LoggerFactory.getLogger(StoreService.class);

	
	@Transactional
    public Long save(StoreSaveRequestDto storeSaveRequestDto){
		
		Long id = storeDao.save(storeSaveRequestDto);
	
		List<BusinessTimeSaveRequestDto> timeSaveRequestDto = convertTime(id, storeSaveRequestDto.getBusinessTimes());
		businessTimeService.save(timeSaveRequestDto);

	List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
	Map<String,Object> insertMap = new HashMap<String,Object>();
	insertMap.put("list",dataList);

	return id;
    }
	
	private List<BusinessTimeSaveRequestDto> convertTime(Long id, JSONArray jsonArray) {
		List<BusinessTimeSaveRequestDto> timeSaveRequestDto = new ArrayList<BusinessTimeSaveRequestDto>();
		for(int i=0; i<jsonArray.size(); i++) {
			BusinessTimeSaveRequestDto dto = new BusinessTimeSaveRequestDto();
			JSONObject json = (JSONObject) jsonArray.get(i); 
			dto.setStoreId(id);
			dto.setDay((String) json.get("day"));
			dto.setOpen((String) json.get("open"));
			dto.setClose((String) json.get("close"));
			timeSaveRequestDto.add(dto);
		}
		return timeSaveRequestDto;
	}
	
}



