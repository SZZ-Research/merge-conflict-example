package com.unb.services;
import java.util.Scanner;

import com.unb.models.Goods;
import com.unb.models.Product;

public class Register {
    public void saller(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of products");
        int nProducts = scanner.nextInt();
        Goods goods = new Goods();
        for (int i = 0; i < nProducts; i++){
            Product product = new Product();
            System.out.println("Insert product name");
            String name = scanner.nextLine();
            product.setName(name);
            System.out.println("Insert product price");
            float price = scanner.nextFloat();
            product.setPrice(price);
            goods.addProduct(product);
        }

    }
}
