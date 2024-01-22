package com.ecommerce.restaurantlisting.service;

import com.ecommerce.restaurantlisting.Entity.RestaurantEntity;
import com.ecommerce.restaurantlisting.dto.RestaurantDTO;

import com.ecommerce.restaurantlisting.mapper.RestaurantMapper;
import com.ecommerce.restaurantlisting.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<RestaurantEntity> restaurants=  restaurantRepo.findAll();
        return restaurants.stream().map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDTO).collect(Collectors.toList());
    }

    public RestaurantDTO saveRestaurant(RestaurantDTO restaurantDTO) {
         return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO)));
    }

    public RestaurantDTO fetchRestaurantById(String id) {
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurantRepo.findById(Integer.valueOf(id)).get());
    }
}
