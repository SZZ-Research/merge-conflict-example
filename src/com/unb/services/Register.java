package com.unb.services;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import com.unb.models.Buyer;
import com.unb.models.Goods;
import com.unb.models.Product;
import com.unb.models.Saller;

public class Register {
    public Goods saller(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Enter number of products");
        int nProducts = scanner.nextInt();
        Goods goods = new Goods();
        goods.setProducts(new LinkedList<>());
        scanner.nextLine();
        for (int i = 0; i < nProducts; i++){
            Product product = new Product();
            System.out.println("Insert product name");
            String name = scanner.next();
            product.setName(name);
            System.out.println("Insert product price");
            float price = scanner.nextFloat();
            product.setPrice(price);
            goods.addProduct(product);
            scanner.nextLine();
        }
        System.out.println("Enter a buyer name");
        Buyer buyer = new Buyer();
        buyer.setName(scanner.nextLine());
        goods.setBuyer(buyer);
        System.out.printf("Enter a saller name");
        Saller saller = new Saller();
        saller.setName(scanner.nextLine());
        goods.setSaller(saller);
        goods.caculatePrice();
        return goods;
    }
}
