package com.fastcode.azzz333.application.core.category.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindCategoryByIdOutput {

  	private Integer categoryId;
  	private LocalDateTime lastUpdate;
  	private String name;
	private Long versiono;
 
}

