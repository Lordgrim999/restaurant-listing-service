package com.ecommerce.restaurantlisting.controller;

import com.ecommerce.restaurantlisting.dto.RestaurantDTO;
import com.ecommerce.restaurantlisting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
@CrossOrigin
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/getAllRestaurants")
    public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurant()
    {
        return new ResponseEntity<>(restaurantService.findAllRestaurants(), HttpStatus.OK);
    }

    @GetMapping("/fetchById/{Id}")
    public ResponseEntity<RestaurantDTO> fetchRestaurantById(@PathVariable String Id)
    {
        return new ResponseEntity<>(restaurantService.fetchRestaurantById(Id), HttpStatus.OK);
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO)
    {
        RestaurantDTO result=restaurantService.saveRestaurant(restaurantDTO);
        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }
}
