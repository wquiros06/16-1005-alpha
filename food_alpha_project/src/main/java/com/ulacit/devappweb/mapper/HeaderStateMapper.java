package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.HeaderStateDTO;
import com.ulacit.devappweb.model.HeaderState;

@Mapper
public interface HeaderStateMapper {

	HeaderStateMapper INSTANCE = Mappers.getMapper(HeaderStateMapper.class);

	List<HeaderStateDTO> headerStatestoHeaderStatesDTOs(List<HeaderState> headerStates);

	@Mappings({ @Mapping(source = "headerStateId", target = "headerStateId"),
			@Mapping(source = "name", target = "name"), 
			@Mapping(source = "description", target = "description") 
	})
	HeaderStateDTO headerStatetoHeaderStateDTO(HeaderState headerState);

}
