package com.ecommerce.restaurantlisting.repo;

import com.ecommerce.restaurantlisting.Entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<RestaurantEntity,Integer> {
}
