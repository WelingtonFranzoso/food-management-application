package com.franzoso.menu.repositories;

import com.franzoso.menu.domain.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, String> {
}
