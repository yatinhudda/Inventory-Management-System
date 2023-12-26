package com.InventoryManagementSystem.InventoryManagementSystem.Model;

import com.InventoryManagementSystem.InventoryManagementSystem.Entities.Product;

import java.util.ArrayList;

public class SearchProduct {

    public Product getProductById(int id){
        ArrayList<Product> productList = new ArrayList<Product>();
        Product appleLaptop = new Product(1, "MacBook Air", "Laptop", "Apple");
        Product lenovoLaptop = new Product(2, "Legion", "Laptop", "Lenovo");
        Product dellLaptop = new Product(3, "Alin", "Laptop", "Dell");
        Product accerLaptop = new Product(4, "Predator", "Laptop", "Accer");
        Product asusLaptop = new Product(5, "ROG", "Laptop", "Assus");
        productList.add(appleLaptop);
        productList.add(lenovoLaptop);
        productList.add(dellLaptop);
        productList.add(accerLaptop);
        productList.add(asusLaptop);
        for(Product product : productList){
            if(product.getProductId() == id){
                return product;
            }
        }
        return new Product(0, "null", "null", "null");
    }

    public Product getProductByName(String name){
        ArrayList<Product> productList = new ArrayList<Product>();
        Product appleLaptop = new Product(1, "MacBook Air", "Laptop", "Apple");
        Product lenovoLaptop = new Product(2, "Legion", "Laptop", "Lenovo");
        Product dellLaptop = new Product(3, "Alin", "Laptop", "Dell");
        Product accerLaptop = new Product(4, "Predator", "Laptop", "Accer");
        Product asusLaptop = new Product(5, "ROG", "Laptop", "Assus");
        productList.add(appleLaptop);
        productList.add(lenovoLaptop);
        productList.add(dellLaptop);
        productList.add(accerLaptop);
        productList.add(asusLaptop);
        for(Product product : productList){
            if(product.getProductName().equals(name)){
                return product;
            }
        }
        return new Product(0, "null", "null", "null");
    }
}
