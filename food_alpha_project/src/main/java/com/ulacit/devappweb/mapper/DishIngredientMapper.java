package com.ulacit.devappweb.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.DishIngredientDTO;
import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.model.DishIngredient;
import com.ulacit.devappweb.model.Ingredient;

@Mapper
public interface DishIngredientMapper {

	DishIngredientMapper INSTANCE = Mappers.getMapper(DishIngredientMapper.class);

	List<DishIngredientDTO> dishIngredientsToDishIngredientsDTOs(List<DishIngredient> dishIngredients);
	
	@Mappings({ 
		@Mapping(source = "dishId", target = "dishId"), 	
		@Mapping(source = "ingredientId", target = "ingredientId") ,
		@Mapping(source = "quantity", target = "quantity") ,
		@Mapping(source = "measure", target = "measure") ,
		})
	IngredientDTO dishIngredientToDishIngredientDTO(DishIngredient dishIngredient);
}
