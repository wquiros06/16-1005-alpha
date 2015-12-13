package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.UserFoodDTO;
import com.ulacit.devappweb.model.UserFood;

@Mapper
public interface UserFoodMapper {

	UserFoodMapper INSTANCE = Mappers.getMapper(UserFoodMapper.class);

	List<UserFoodDTO> userFoodstoUserFoodsDTOs(List<UserFood> userFoods);

	@Mappings({ @Mapping(source = "userFoodId", target = "userFoodId"),
			@Mapping(source = "userName", target = "userName"), @Mapping(source = "password", target = "password"),
			@Mapping(source = "attempt", target = "attempt"), @Mapping(source = "state", target = "state") })
	UserFoodDTO userFoodtoUserFoodDTO(UserFood userFood);

}
