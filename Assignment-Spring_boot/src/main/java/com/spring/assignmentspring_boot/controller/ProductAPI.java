package com.spring.assignmentspring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductAPI {
    @GetMapping
    public String getProduct() {
        return "Product";
    }
}
