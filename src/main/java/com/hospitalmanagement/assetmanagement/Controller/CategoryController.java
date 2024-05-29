package com.hospitalmanagement.assetmanagement.Controller;
import com.hospitalmanagement.assetmanagement.Model.CategoryModel;
import com.hospitalmanagement.assetmanagement.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

//    @GetMapping("/")
//    public String home(){
//        return "index";
//    }


    @PostMapping("/add")
    public CategoryModel addCategory(@RequestBody CategoryModel categoryModel) {
        return categoryService.saveCategoryModel(categoryModel);
    }

    @PostMapping("/addAll")
    public List<CategoryModel> addCategories(@RequestBody List<CategoryModel> categoryModels) {
        return categoryService.saveCategoryModels(categoryModels);
    }

    @GetMapping("/all")
    public List<CategoryModel> findAllCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/{id}")
    public CategoryModel findCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/update")
    public CategoryModel updateCategory(@RequestBody CategoryModel categoryModel) {
        return categoryService.updateCategory(categoryModel);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id) {
        return categoryService.deleteCategory(id);
    }
}
