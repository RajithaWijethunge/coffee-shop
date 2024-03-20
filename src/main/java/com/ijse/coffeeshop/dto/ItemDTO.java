package com.ijse.coffeeshop.dto;

import com.ijse.coffeeshop.domain.ItemCategory;

import lombok.Data;

@Data
public class ItemDTO {
    private Long itemId;
    private String itemName;
    private String description;
    private Double price;
    private ItemCategory category;
}
