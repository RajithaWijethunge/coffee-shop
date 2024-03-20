package com.ijse.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ijse.coffeeshop.domain.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

    
}