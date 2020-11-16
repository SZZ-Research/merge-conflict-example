package com.unb.models;

public class Product {
    private float price;
    private String name;

    public void setPrice(float price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
