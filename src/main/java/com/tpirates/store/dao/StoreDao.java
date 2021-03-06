package com.tpirates.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tpirates.store.dto.StoreSaveRequestDto;
import com.tpirates.store.dto.StoreSearchResponseDto;

@Mapper
public interface StoreDao {
	
	Long save(StoreSaveRequestDto saveDto);
	
	List<StoreSearchResponseDto> select();

}
