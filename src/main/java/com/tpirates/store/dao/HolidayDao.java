package com.tpirates.store.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tpirates.store.dto.HolidaySaveRequestDto;
import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.dto.StoreSearchResponseDto;

@Mapper
public interface HolidayDao {
	
	void save(Long id, Date holiday);
	
}
