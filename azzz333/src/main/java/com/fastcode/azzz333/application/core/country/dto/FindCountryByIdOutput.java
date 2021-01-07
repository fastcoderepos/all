package com.fastcode.azzz333.application.core.country.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindCountryByIdOutput {

  	private String country;
  	private Integer countryId;
  	private LocalDateTime lastUpdate;
	private Long versiono;
 
}

