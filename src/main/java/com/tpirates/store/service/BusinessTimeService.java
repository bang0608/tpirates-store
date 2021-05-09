package com.tpirates.store.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpirates.store.dao.BusinessTimeDao;
import com.tpirates.store.dto.BusinessTimeSaveRequestDto;


@Service
public class BusinessTimeService implements BusinessTimeDao{
	
	@Autowired
    private BusinessTimeDao businessTimeDao;

    private Logger logger = LoggerFactory.getLogger(BusinessTimeService.class);

	@Override
	public void saveAll(List<BusinessTimeSaveRequestDto> saveDtoList) {
		businessTimeDao.saveAll(saveDtoList);
	}

	
}



