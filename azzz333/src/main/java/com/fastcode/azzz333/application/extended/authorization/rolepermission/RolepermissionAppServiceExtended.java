package com.fastcode.azzz333.application.extended.authorization.rolepermission;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.authorization.rolepermission.RolepermissionAppService;

import com.fastcode.azzz333.domain.extended.authorization.rolepermission.IRolepermissionRepositoryExtended;
import com.fastcode.azzz333.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.azzz333.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.azzz333.domain.extended.authorization.userrole.IUserroleRepositoryExtended;
import com.fastcode.azzz333.security.JWTAppService;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("rolepermissionAppServiceExtended")
public class RolepermissionAppServiceExtended extends RolepermissionAppService implements IRolepermissionAppServiceExtended {

	public RolepermissionAppServiceExtended(JWTAppService jwtAppService,IUserroleRepositoryExtended userroleRepositoryExtended,IRolepermissionRepositoryExtended rolepermissionRepositoryExtended,
				IPermissionRepositoryExtended permissionRepositoryExtended,IRoleRepositoryExtended roleRepositoryExtended,IRolepermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(jwtAppService, userroleRepositoryExtended,rolepermissionRepositoryExtended,
		permissionRepositoryExtended,roleRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

