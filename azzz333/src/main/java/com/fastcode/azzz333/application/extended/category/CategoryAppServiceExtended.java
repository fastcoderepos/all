package com.fastcode.azzz333.application.extended.category;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.category.CategoryAppService;

import com.fastcode.azzz333.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("categoryAppServiceExtended")
public class CategoryAppServiceExtended extends CategoryAppService implements ICategoryAppServiceExtended {

	public CategoryAppServiceExtended(ICategoryRepositoryExtended categoryRepositoryExtended,
				ICategoryMapperExtended mapper,LoggingHelper logHelper) {

		super(categoryRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

