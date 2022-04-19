package com.storeapi.storeAPI.controller;

import com.storeapi.storeAPI.entity.Product;
import com.storeapi.storeAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/prod")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product prod){
        productService.addUpdateProduct(prod);
        return prod;
    }

    @PutMapping("/cat/{catId}/prod/{pName}")
    public void updateProduct(@PathVariable Integer catId,@PathVariable String pName,@RequestBody Product prod){
        productService.addUpdateProduct(prod);
    }

    @DeleteMapping("/prodDel/{pName}")
    public void deleteProduct(@PathVariable String pName){
        productService.deleteProduct(pName);
    }

}
