package com.storeapi.storeAPI.service;


import com.storeapi.storeAPI.entity.Category;
import com.storeapi.storeAPI.entity.Product;
import com.storeapi.storeAPI.repository.CategoryRepository;
import com.storeapi.storeAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    public List<Category> getAllCategory(){

        return categoryRepository.findAll();
    }

    public List<Product> getCategoryById(int catId){
        List<Product> category = productRepository.findAllByCategoryCatId(catId);
        return category;

    }

    public void createOrUpdate(Category cat){
        categoryRepository.save(cat);
    }



}
