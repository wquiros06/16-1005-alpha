/**
 * 
 */
package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.MenuDTO;
import com.ulacit.devappweb.model.Menu;

/**
 * @author Desarrollo
 *
 */
@Mapper
public interface MenuMapper {
	MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

	List<MenuDTO> menuestoMenuesDTOs(List<Menu> menues);

	@Mappings({ @Mapping(source = "menuId", target = "menuId"), @Mapping(source = "startDate", target = "startDate"),
			@Mapping(source = "endDate", target = "endDate") })
	MenuDTO menutoMenuDTO(Menu menu);

}
