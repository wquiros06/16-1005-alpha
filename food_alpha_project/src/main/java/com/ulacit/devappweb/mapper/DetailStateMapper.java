/**
 * 
 */
package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.DetailStateDTO;
import com.ulacit.devappweb.model.DetailState;
/**
 * @author Desarrollo
 *
 */
@Mapper
public interface DetailStateMapper {
	
	DetailStateMapper INSTANCE = Mappers.getMapper(DetailStateMapper.class);

		List<DetailStateDTO> detailStatestoDetailStatesDTOs(List<DetailState> detailStates);
		
		@Mappings({ 
			@Mapping(source = "detailStateId", target = "detailStateId"),	
			@Mapping(source = "name", target = "name")
			})
		DetailStateDTO detailStatetoDetailStateDTO(DetailState detailState);
		

}
