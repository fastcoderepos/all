package com.fastcode.azzz333.application.extended.authorization.userrole;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.authorization.userrole.UserroleAppService;

import com.fastcode.azzz333.domain.extended.authorization.userrole.IUserroleRepositoryExtended;
import com.fastcode.azzz333.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.azzz333.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("userroleAppServiceExtended")
public class UserroleAppServiceExtended extends UserroleAppService implements IUserroleAppServiceExtended {

	public UserroleAppServiceExtended(IUserroleRepositoryExtended userroleRepositoryExtended,
				IRoleRepositoryExtended roleRepositoryExtended,IUserRepositoryExtended userRepositoryExtended,IUserroleMapperExtended mapper,LoggingHelper logHelper) {

		super(userroleRepositoryExtended,
		roleRepositoryExtended,userRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

