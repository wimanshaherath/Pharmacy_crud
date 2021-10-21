package com.pharmacy.CRUD.controller;

import com.pharmacy.CRUD.Service.ItemService;
import com.pharmacy.CRUD.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping
    public String addItem(@RequestBody Item item) {
        itemService.addItem(item);
        return "success";
//        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public String updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
//        return ResponseEntity.ok().build();
        return "updated";
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable String id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
