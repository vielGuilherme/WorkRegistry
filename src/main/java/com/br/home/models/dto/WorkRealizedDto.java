package com.br.home.models.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class WorkRealizedDto {
	
	private String workType;
	private String material;
	private Date workDateRealized;
	private Double workValue;
}
