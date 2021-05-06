package com.tpirates.store.dao;

import org.apache.ibatis.annotations.Mapper;

import com.tpirates.store.dto.StoreSaveRequestDto;

@Mapper
public interface StoreDao {
	
	Long save(StoreSaveRequestDto saveDto);

}
