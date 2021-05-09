package com.tpirates.store.service;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpirates.store.dao.BusinessTimeDao;
import com.tpirates.store.dao.HolidayDao;
import com.tpirates.store.dto.BusinessTimeSaveRequestDto;
import com.tpirates.store.dto.HolidaySaveRequestDto;


@Service
public class HolidayService implements HolidayDao{
	
	@Autowired
    private HolidayDao holidayDao;

    private Logger logger = LoggerFactory.getLogger(HolidayService.class);
    
    public void saveAll(Long id, List<Date> holidays) {
    	for(int i=0; i< holidays.size(); i++) {
    		logger.info("holiday:saveAll:id === " + id);
    		save(id, holidays.get(i));
    	}
    }

    @Override
	public void save(Long id, Date holidays) {
    	logger.info("holiday:save:id === " + id);
    	holidayDao.save(id, holidays);
	}

	
}



