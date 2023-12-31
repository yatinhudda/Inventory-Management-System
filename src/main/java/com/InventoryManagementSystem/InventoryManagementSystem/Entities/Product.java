package com.InventoryManagementSystem.InventoryManagementSystem.Entities;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int productId;
    private String productName;
    private String productCategory;
    private String productBrand;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }
}
