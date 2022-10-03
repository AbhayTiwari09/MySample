package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Drink;


public interface DrinkRepository extends CrudRepository<Drink, Integer>{

		List<Drink> findByName(String name);
		
		List<Drink> findByType(String Type);
		
	}

