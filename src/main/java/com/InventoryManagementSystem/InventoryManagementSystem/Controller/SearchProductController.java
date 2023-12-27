package com.InventoryManagementSystem.InventoryManagementSystem.Controller;

import com.InventoryManagementSystem.InventoryManagementSystem.Entities.Product;
import com.InventoryManagementSystem.InventoryManagementSystem.Model.SearchProduct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/search")
public class SearchProductController {
    @GetMapping
    public String searchNothing(){
        System.out.println("Inside Search Nothing");
        return "Search Nothing : |";
    }
    @RequestMapping(method = RequestMethod.GET, path = "/searchById")
    public Product searchById(@RequestParam("Id") int id){
        System.out.println("Inside Search by Id");
        SearchProduct searchProduct = new SearchProduct();
        return searchProduct.getProductById(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/searchByName")
    public Product searchByProductName(@RequestParam("Name") String name){
        System.out.println("Inside Search By Name");
        SearchProduct searchProduct = new SearchProduct();
        return searchProduct.getProductByName(name);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/searchByCategory")
    public List<Product> searchByProductCategory(@RequestParam("Category") String category){
        System.out.println("Inside Search By Category");
        SearchProduct searchProduct = new SearchProduct();
        return searchProduct.getProductByCategory(category);
    }

}
