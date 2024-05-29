package com.hospitalmanagement.assetmanagement.Controller;
import com.hospitalmanagement.assetmanagement.Model.ProductModel;
import com.hospitalmanagement.assetmanagement.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ProductModel createProduct(@RequestBody ProductModel productModel) {
        return productService.createProduct(productModel);
    }

    @GetMapping("/all")
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/byCategory/{categoryName}")
    public List<ProductModel> getProductsByCategoryName(@PathVariable("categoryName") String categoryName) {
        return productService.getProductsByCategoryName(categoryName);
    }
}
