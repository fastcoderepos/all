package com.fastcode.azzz333.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.azzz333.restcontrollers.core.ActorController;
import com.fastcode.azzz333.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.azzz333.application.extended.filmactor.IFilmActorAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/actor/extended")
public class ActorControllerExtended extends ActorController {

		public ActorControllerExtended(IActorAppServiceExtended actorAppServiceExtended, IFilmActorAppServiceExtended filmActorAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		actorAppServiceExtended,
    	filmActorAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

