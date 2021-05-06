package com.tpirates.store.dto;

import lombok.Data;

@Data
public class BusinessTimeSaveRequestDto {
	private Long storeId;
	private String day;
	private String open;
	private String close;
}
