package com.storeapi.storeAPI.repository;

import com.storeapi.storeAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {


    List<Product> findAllByCategoryCatId(int categoryId);
}
