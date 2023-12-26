package com.InventoryManagementSystem.InventoryManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/search")
public class SearchProduct {
    @GetMapping
    public String searchNothing(){
        System.out.println("Inside Search Nothing");
        return "Search Nothing : |";
    }
}
