package com.tpirates.store.dto;

import org.json.simple.JSONArray;

import lombok.Data;

@Data
public class StoreSearchResponseDto {
	private Long id;
	private String name;
	private String address;
	private String phone;
	private Integer level;
	private String description;
	private JSONArray jsonArray;
}
