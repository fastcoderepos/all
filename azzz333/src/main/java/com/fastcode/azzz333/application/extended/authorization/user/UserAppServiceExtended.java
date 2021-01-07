package com.fastcode.azzz333.application.extended.authorization.user;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.authorization.user.UserAppService;

import com.fastcode.azzz333.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.azzz333.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

	public UserAppServiceExtended(IUserRepositoryExtended userRepositoryExtended,
				IUserpreferenceRepository userpreferenceRepository,IUserMapperExtended mapper,LoggingHelper logHelper) {

		super(userRepositoryExtended,
		userpreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

