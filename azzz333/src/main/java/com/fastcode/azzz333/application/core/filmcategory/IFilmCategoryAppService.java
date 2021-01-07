package com.fastcode.azzz333.application.core.filmcategory;

import com.fastcode.azzz333.domain.core.filmcategory.FilmCategoryId;
import org.springframework.data.domain.Pageable;
import com.fastcode.azzz333.application.core.filmcategory.dto.*;
import com.fastcode.azzz333.commons.search.SearchCriteria;

import java.util.*;

public interface IFilmCategoryAppService {
	
	//CRUD Operations
	
	CreateFilmCategoryOutput create(CreateFilmCategoryInput filmcategory);

    void delete(FilmCategoryId filmCategoryId);

    UpdateFilmCategoryOutput update(FilmCategoryId filmCategoryId, UpdateFilmCategoryInput input);

    FindFilmCategoryByIdOutput findById(FilmCategoryId filmCategoryId);

    List<FindFilmCategoryByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
    
    GetCategoryOutput getCategory(FilmCategoryId filmCategoryId);
    
    GetFilmOutput getFilm(FilmCategoryId filmCategoryId);
    
    //Join Column Parsers
    
	FilmCategoryId parseFilmCategoryKey(String keysString);
}
