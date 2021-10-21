package com.pharmacy.CRUD.repository;

import com.pharmacy.CRUD.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,Integer> {
}
