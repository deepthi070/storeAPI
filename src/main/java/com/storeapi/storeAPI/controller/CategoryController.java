package com.storeapi.storeAPI.controller;

import com.storeapi.storeAPI.entity.Category;
import com.storeapi.storeAPI.entity.Product;
import com.storeapi.storeAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/cat")
    public List<Category> getAllCategory(){

        return categoryService.getAllCategory();
    }

    @GetMapping("/cat/{catId}")
    public List<Product> getCategoryById(@PathVariable int catId){
        return categoryService.getCategoryById(catId);
    }


    @PostMapping("/category")
    public Category createCategory(@RequestBody Category cat){
        categoryService.createOrUpdate(cat);
        return cat;
    }

    @PutMapping("/category/{catId}")
    public void updateCategory(@RequestBody Category cat,@PathVariable Integer catId){
        categoryService.createOrUpdate(cat);
    }
}
