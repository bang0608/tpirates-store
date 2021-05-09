package com.tpirates.store.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tpirates.store.dto.HolidaySaveRequestDto;
import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.service.HolidayService;
import com.tpirates.store.service.StoreService;

@RestController
public class HolidayApiController {
	
	private static final Logger logger = LoggerFactory.getLogger(HolidayApiController.class);

	@Autowired
	private HolidayService holidayService;
			
	@PostMapping(value="/api/v1/holidays", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody HolidaySaveRequestDto requestDto) {
		
		logger.info("dto.storeId === " + requestDto.getId());
		
		logger.info("dto.getHolidays === " + requestDto.getHolidays().get(0));
		logger.info("dto.getHolidays === " + requestDto.getHolidays().get(1));
		
		
		holidayService.saveAll(requestDto.getId(), requestDto.getHolidays());
    }

}
