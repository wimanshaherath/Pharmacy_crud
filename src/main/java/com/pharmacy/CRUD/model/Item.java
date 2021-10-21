package com.pharmacy.CRUD.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document("item")
public class Item {
    @Id
    @Indexed(unique = true)
    public int id;
    @Field(name="name")
    public String name;
    @Field(name="brand")
    public String brand;
    @Field(name="price")
    public BigDecimal price;
    @Field(name="qty")
    public int qty;

    public Item() {
    }

    public Item(int id, String name, String brand, BigDecimal price, int qty) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
