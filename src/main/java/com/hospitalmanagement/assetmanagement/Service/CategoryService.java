package com.hospitalmanagement.assetmanagement.Service;

import com.hospitalmanagement.assetmanagement.Model.CategoryModel;
import com.hospitalmanagement.assetmanagement.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepository;

    public CategoryModel saveCategoryModel(CategoryModel categoryModel) {
        return categoryRepository.save(categoryModel);
    }

    public List<CategoryModel> saveCategoryModels(List<CategoryModel> categoryModels) {
        return categoryRepository.saveAll(categoryModels);
    }

    public List<CategoryModel> getCategories() {
        return categoryRepository.findAll();
    }

    public CategoryModel getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public String deleteCategory(int id) {
        categoryRepository.deleteById(id);
        return "Category removed with id: " + id;
    }

    public CategoryModel updateCategory(CategoryModel categoryModel) {
        Optional<CategoryModel> optionalExistingCategory = categoryRepository.findById(categoryModel.getId());
        if (optionalExistingCategory.isPresent()) {
            CategoryModel existingCategory = optionalExistingCategory.get();
            existingCategory.setName(categoryModel.getName());
            existingCategory.setDescription(categoryModel.getDescription());
            return categoryRepository.save(existingCategory);
        } else {
            return null;
        }
    }
}
