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
public class BusinessTimeService implements BusinessTimeDao{
	
	@Autowired
    private BusinessTimeDao businessTimeDao;

    private Logger logger = LoggerFactory.getLogger(BusinessTimeService.class);

	@Override
	public void save(List<BusinessTimeSaveRequestDto> saveDtoList) {
		businessTimeDao.save(saveDtoList);
	}

	
}



