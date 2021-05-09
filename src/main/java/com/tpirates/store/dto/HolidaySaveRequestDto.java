package com.tpirates.store.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class HolidaySaveRequestDto {
	private Long id;
	private List<Date> holidays;
}
