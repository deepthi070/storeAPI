package com.storeapi.storeAPI.repository;

import com.storeapi.storeAPI.entity.Category;
import com.storeapi.storeAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    List<Product> findByArchiveEquals(boolean archive);
}
