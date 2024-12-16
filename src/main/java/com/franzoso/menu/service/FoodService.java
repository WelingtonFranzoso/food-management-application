package com.franzoso.menu.service;

import com.franzoso.menu.domain.food.Food;
import com.franzoso.menu.domain.food.FoodRequestDTO;
import com.franzoso.menu.domain.food.FoodResponseDTO;
import com.franzoso.menu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public void saveFood(FoodRequestDTO requestDTO) {
        Food foodData = new Food(requestDTO);
        foodRepository.save(foodData);
    }

    public List<FoodResponseDTO> findAll() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}