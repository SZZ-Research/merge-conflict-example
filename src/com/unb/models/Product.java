package com.unb.models;

public class Product {
    private float price;
    private String name;
    private String expirationDate;

    public void setPrice(float price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setExpirationDate(String name){
        this.name = name;
    }

    public float getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
    
    public float getExpirationDate(){
        return this.price;
    }
}
