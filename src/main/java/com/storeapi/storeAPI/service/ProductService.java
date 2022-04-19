package com.storeapi.storeAPI.service;

import com.storeapi.storeAPI.entity.Product;
import com.storeapi.storeAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void addUpdateProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(String pName){
        productRepository.deleteById(pName);
    }



}
