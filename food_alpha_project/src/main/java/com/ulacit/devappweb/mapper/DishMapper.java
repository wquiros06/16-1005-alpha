package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.DishDTO;
import com.ulacit.devappweb.model.Dish;

@Mapper
public interface DishMapper {

	DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);

	List<DishDTO> dishestoDishesDTOs(List<Dish> dishes);

	@Mappings({ @Mapping(source = "dishId", target = "dishId"), @Mapping(source = "name", target = "name"),
			@Mapping(source = "description", target = "description"), @Mapping(source = "photo", target = "photo") })
	DishDTO dishtoDishDTO(Dish dish);

}
