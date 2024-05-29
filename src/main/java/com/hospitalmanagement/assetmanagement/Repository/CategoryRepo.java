package com.hospitalmanagement.assetmanagement.Repository;

import com.hospitalmanagement.assetmanagement.Model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryModel, Integer> {
}
