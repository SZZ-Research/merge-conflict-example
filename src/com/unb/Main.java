package com.unb;

import com.unb.models.Goods;
import com.unb.services.Register;

public class Main {
    public static void main(String[] args) {
        System.out.println("SuperMarketCalculator");
        Register register = new Register();
        Goods goods = register.saller();
        System.out.println("Saller = " + goods.getSaller());
        System.out.println("Buyer = " + goods.getBuyer());
        System.out.println("Price = " + goods.getPrice());
    }
}
