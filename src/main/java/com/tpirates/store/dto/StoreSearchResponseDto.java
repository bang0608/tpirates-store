package com.tpirates.store.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class StoreSearchResponseDto {
	private Long id;
	private String name;
	private String address;
	private String phone;
	private Integer level;
	private String description;
	private List<Map<String, String>> businessTimes;
}
