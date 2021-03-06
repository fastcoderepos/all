package com.fastcode.azzz333.application.extended.authorization.role;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.authorization.role.RoleAppService;

import com.fastcode.azzz333.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("roleAppServiceExtended")
public class RoleAppServiceExtended extends RoleAppService implements IRoleAppServiceExtended {

	public RoleAppServiceExtended(IRoleRepositoryExtended roleRepositoryExtended,
				IRoleMapperExtended mapper,LoggingHelper logHelper) {

		super(roleRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

