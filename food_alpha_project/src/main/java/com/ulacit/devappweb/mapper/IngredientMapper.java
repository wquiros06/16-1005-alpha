/**
 * 
 */
package com.ulacit.devappweb.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.model.Ingredient;

/**
 * @author Desarrollo
 *
 */
@Mapper
public interface IngredientMapper {

	IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

	List<IngredientDTO> ingredientsToIngredientsDTOs(List<Ingredient> ingredients);
	
	@Mappings({ 
		@Mapping(source = "id", target = "id"), 	
		@Mapping(source = "name", target = "name") 
		})
	IngredientDTO ingredientToIngredientDTO(Ingredient ingredient);
}