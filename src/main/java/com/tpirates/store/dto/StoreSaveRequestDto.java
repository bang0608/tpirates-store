package com.tpirates.store.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
public class StoreSaveRequestDto {
	private String name;
	private String owner;
	private String address;
	private String phone;
	private int level;
	private String description;
	private List<Map<String, String>> businessTimes;
}
