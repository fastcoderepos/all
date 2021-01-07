package com.fastcode.azzz333.application.extended.inventory;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.inventory.InventoryAppService;

import com.fastcode.azzz333.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.azzz333.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("inventoryAppServiceExtended")
public class InventoryAppServiceExtended extends InventoryAppService implements IInventoryAppServiceExtended {

	public InventoryAppServiceExtended(IInventoryRepositoryExtended inventoryRepositoryExtended,
				IFilmRepositoryExtended filmRepositoryExtended,IInventoryMapperExtended mapper,LoggingHelper logHelper) {

		super(inventoryRepositoryExtended,
		filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

