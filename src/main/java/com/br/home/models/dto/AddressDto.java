package com.br.home.models.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
	
	private String street;
	private String neighborhood;
	private int number;
}
