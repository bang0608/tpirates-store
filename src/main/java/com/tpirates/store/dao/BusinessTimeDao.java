package com.tpirates.store.dao;

import org.apache.ibatis.annotations.Mapper;

import com.tpirates.store.dto.BusinessTimeSaveRequestDto;

import java.util.*;

@Mapper
public interface BusinessTimeDao {
	
	void save(List<BusinessTimeSaveRequestDto> saveDtoList);

}
