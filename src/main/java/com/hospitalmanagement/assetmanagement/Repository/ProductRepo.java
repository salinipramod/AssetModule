package com.hospitalmanagement.assetmanagement.Repository;

import com.hospitalmanagement.assetmanagement.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long> {
    List<ProductModel> findByCategoryName(String categoryName);
}
