package com.unb.models;

import java.util.List;

public class Goods {
    private Saller saller;
    private List<Product> products;
    private Buyer buyer;

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
}
