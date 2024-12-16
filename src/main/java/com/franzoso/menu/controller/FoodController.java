package com.franzoso.menu.controller;

import com.franzoso.menu.domain.food.FoodRequestDTO;
import com.franzoso.menu.domain.food.FoodResponseDTO;
import com.franzoso.menu.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO requestDTO) {
        foodService.saveFood(requestDTO);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        return foodService.findAll();
    }
}
