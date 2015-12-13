package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.OrdersDTO;
import com.ulacit.devappweb.model.Orders;

@Mapper
public interface OrdersMapper {
	OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);

	List<OrdersDTO> orderstoOrdersDTOs(List<Orders> orders);

	@Mappings({ @Mapping(source = "ordersId", target = "ordersId"),
			@Mapping(source = "dateOrder", target = "dateOrder") })
	OrdersDTO ordertoOrderDTO(Orders orders);

}
