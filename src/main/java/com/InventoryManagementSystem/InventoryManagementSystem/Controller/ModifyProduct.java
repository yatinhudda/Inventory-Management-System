package com.InventoryManagementSystem.InventoryManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/modify")
public class ModifyProduct {
    @GetMapping
    public String modifyNothing(){
        System.out.println("Inside modify Nothing");
        return "Nothing Happen :|";
    }
}
