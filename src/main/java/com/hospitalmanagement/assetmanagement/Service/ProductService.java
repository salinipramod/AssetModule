package com.hospitalmanagement.assetmanagement.Service;
import com.hospitalmanagement.assetmanagement.Model.ProductModel;
import com.hospitalmanagement.assetmanagement.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repository;

    public ProductModel createProduct(ProductModel product) {
        return repository.save(product);
    }

    public List<ProductModel> getAllProducts() {
        return repository.findAll();
    }

    public List<ProductModel> getProductsByCategoryName(String categoryName) {
        return repository.findByCategoryName(categoryName);
    }
}
