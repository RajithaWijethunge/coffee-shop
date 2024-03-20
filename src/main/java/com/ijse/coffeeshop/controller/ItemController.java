package com.ijse.coffeeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.coffeeshop.dto.ItemDTO;
import com.ijse.coffeeshop.service.ItemService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class ItemController {
    @Autowired
    private ItemService itemService;

    // Endpoint to create a new Item
    @PostMapping("/item")
    public ResponseEntity<ItemDTO> createItem(@RequestBody ItemDTO itemDTO) throws Exception {
       ItemDTO cratedItem = itemService.createItem(itemDTO);
       return new ResponseEntity<>(cratedItem, HttpStatus.CREATED);
    }
}
