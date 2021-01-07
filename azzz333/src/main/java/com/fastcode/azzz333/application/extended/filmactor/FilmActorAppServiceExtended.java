package com.fastcode.azzz333.application.extended.filmactor;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.filmactor.FilmActorAppService;

import com.fastcode.azzz333.domain.extended.filmactor.IFilmActorRepositoryExtended;
import com.fastcode.azzz333.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.azzz333.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

	public FilmActorAppServiceExtended(IFilmActorRepositoryExtended filmActorRepositoryExtended,
				IActorRepositoryExtended actorRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmActorMapperExtended mapper,LoggingHelper logHelper) {

		super(filmActorRepositoryExtended,
		actorRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

