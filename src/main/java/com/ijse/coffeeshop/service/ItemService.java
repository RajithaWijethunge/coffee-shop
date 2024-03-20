package com.ijse.coffeeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.coffeeshop.domain.Item;
import com.ijse.coffeeshop.dto.ItemDTO;
import com.ijse.coffeeshop.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemDTO createItem(final ItemDTO itemDTO) throws Exception {
        // Map ItemDTO to Item domain object
        Item itemToCreate = mapItemDTOToItem(itemDTO);

        Item createdItem = itemRepository.save(itemToCreate);

        return mapItemToItemDTO(createdItem);
    }

    private Item mapItemDTOToItem(final ItemDTO itemDTO) {
        Item item = new Item();
        item.setItemName(itemDTO.getItemName());
        item.setDescription(itemDTO.getDescription());
        item.setPrice(itemDTO.getPrice());
        item.setCategory(itemDTO.getCategory());

        return item;
    }

    private ItemDTO mapItemToItemDTO(final Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setItemName(item.getItemName());
        itemDTO.setDescription(item.getDescription());
        itemDTO.setPrice(item.getPrice());
        itemDTO.setCategory(item.getCategory());

        return itemDTO;
    }
}
