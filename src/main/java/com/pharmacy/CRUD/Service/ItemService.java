package com.pharmacy.CRUD.Service;

import com.pharmacy.CRUD.model.Item;
import com.pharmacy.CRUD.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem(Item item) {
        itemRepository.insert(item);
    }

    public void updateItem(Item item) {
        Item savedItem = itemRepository.findById(item.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find by ID item %d", item.getId())
                ));
        savedItem.setName(item.getName());
        savedItem.setBrand(item.getBrand());
        savedItem.setQty(item.getQty());
        savedItem.setPrice(item.getPrice());

        itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(String id) {
        return itemRepository.findById(Integer.parseInt(id))
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find by ID item %s", id)
                ));
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(Integer.parseInt(id));
    }
}
