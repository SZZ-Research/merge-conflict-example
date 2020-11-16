package com.unb.models;

public class Product {
    private String price;
    private String name;

    public void setPrice(String price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(String price){
        return this.price;
    }

    public String getName(String name){
        return this.name;
    }
}
