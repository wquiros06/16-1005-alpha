package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.ContactDTO;
import com.ulacit.devappweb.model.Contact;

@Mapper
public interface ContactMapper  {
	ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

	List<ContactDTO> contactstoContactsDTOs(List<Contact> contacts);
	
	@Mappings({ 
		@Mapping(source = "contactId", target = "contactId"),	
		@Mapping(source = "email", target = "email")
		})
	ContactDTO contacttoContactDTO(Contact contact);
	

}
