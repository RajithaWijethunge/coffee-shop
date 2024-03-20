package com.ijse.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ijse.coffeeshop.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
