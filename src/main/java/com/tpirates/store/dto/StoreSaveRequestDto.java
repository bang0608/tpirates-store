package com.tpirates.store.dto;

import org.json.simple.JSONArray;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StoreSaveRequestDto {
	private String name;
	private String owner;
	private String address;
	private String phone;
	private int level;
	private String description;
	private JSONArray businessTimes;
}
