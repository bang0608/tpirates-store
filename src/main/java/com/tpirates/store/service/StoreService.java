package com.tpirates.store.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tpirates.store.dao.BusinessTimeDao;
import com.tpirates.store.dao.StoreDao;
import com.tpirates.store.dto.BusinessTimeSaveRequestDto;
import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.dto.StoreSearchResponseDto;


@Service
public class StoreService implements StoreDao{
	
	@Autowired
    private StoreDao storeDao;
	
	@Autowired
    private BusinessTimeService businessTimeService;
	
    private Logger logger = LoggerFactory.getLogger(StoreService.class);

	
	@Transactional
	@Override
    public Long save(StoreSaveRequestDto storeSaveRequestDto) {
		
		Long id = storeDao.save(storeSaveRequestDto);
	
		List<BusinessTimeSaveRequestDto> timeSaveRequestDto = convertTime(id, storeSaveRequestDto.getBusinessTimes());
		businessTimeService.saveAll(timeSaveRequestDto);

	List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
	Map<String,Object> insertMap = new HashMap<String,Object>();
	insertMap.put("list",dataList);

	return id;
    }
	
	@Override
	public List<StoreSearchResponseDto> select() {
		List<StoreSearchResponseDto> list = storeDao.select();
		return null;
	}
	
	private List<BusinessTimeSaveRequestDto> convertTime(Long id, List<Map<String, String>> timeList) {
		List<BusinessTimeSaveRequestDto> timeSaveRequestDto = new ArrayList<BusinessTimeSaveRequestDto>();
				
//		logger.info("convertTime:jsonArray === " + jsonArray.toString());
//		logger.info("convertTime:jsonArray === " + jsonArray.size());
//		logger.info("convertTime:jsonArray === " + jsonArray.get(0).toString());
		
//		JsonObject test = (JsonObject) jsonArray.get(0);
				
//		logger.info(test.toString());
				
//		logger.info("convertTime:jsonObject === " + test.toJSONString());
		
		for(int i=0; i<timeList.size(); i++) {
			BusinessTimeSaveRequestDto dto = new BusinessTimeSaveRequestDto();
			
			logger.info("timeList === " + timeList.get(i).toString());
			
			dto.setStoreId(id);
			dto.setDay(timeList.get(i).get("day"));
			dto.setOpen(timeList.get(i).get("open"));
			dto.setClose(timeList.get(i).get("close"));
			
			logger.info("convertTime:day === " + dto.getDay());
			logger.info("convertTime:open === " + dto.getOpen());
			logger.info("convertTime:close === " + dto.getClose());
			
			timeSaveRequestDto.add(dto);
		}
		return timeSaveRequestDto;
	}
	
}





