package com.fastcode.azzz333.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.azzz333.restcontrollers.core.UserroleController;
import com.fastcode.azzz333.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import com.fastcode.azzz333.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.azzz333.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.azzz333.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userrole/extended")
public class UserroleControllerExtended extends UserroleController {

		public UserroleControllerExtended(IUserroleAppServiceExtended userroleAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended, IUserAppServiceExtended userAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userroleAppServiceExtended,
    	roleAppServiceExtended,
    	userAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

