package com.unb.models;

import java.util.List;

public class Goods {
    private Saller saller;
    private List<Product> products;
    private Buyer buyer;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;

    public Saller getSaller() {
        return saller;
    }

    public void setSaller(Saller saller) {
        this.saller = saller;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void caculatePrice(){
        this.price = 0;
        for (int i=0; i < this.products.size(); i++ ){
            this.price += this.products.get(i).getPrice();
        }
    }
}
