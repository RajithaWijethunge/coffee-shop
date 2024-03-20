package com.ijse.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ijse.coffeeshop.domain.ItemCategory;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {

}
