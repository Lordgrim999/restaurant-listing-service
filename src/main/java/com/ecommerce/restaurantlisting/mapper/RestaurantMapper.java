package com.ecommerce.restaurantlisting.mapper;


import com.ecommerce.restaurantlisting.Entity.RestaurantEntity;
import com.ecommerce.restaurantlisting.dto.RestaurantDTO;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);

    RestaurantDTO mapRestaurantToRestaurantDTO(RestaurantEntity restaurant);
    RestaurantEntity mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
}
