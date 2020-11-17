package com.springboot.ex.demo.controller;

import com.springboot.ex.demo.model.Category;
import com.springboot.ex.demo.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    //Get all category
    @GetMapping("category/list")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<Category>> showCategoryList() {
        List<Category> categoryList = (List<Category>) categoryRepository.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    //Get category by id
    @GetMapping("category/{id}")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Object> getCategoryById(@PathVariable("id") Integer id) {
        System.out.println("Fetching category with id " + id);
        Optional<Category> category = categoryRepository.findById(id);
        if (category == null){
            return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(category,HttpStatus.OK);
    }

    // Create category
    @PostMapping("category/save")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<String> createCategory(@Valid @RequestBody Category category ) {
        if(category == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        categoryRepository.save(category);
        return new ResponseEntity<>("created!", HttpStatus.CREATED);
    }

    // Update category
    @PutMapping("category/update/{id}")
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
        public ResponseEntity<String> updateCategory(@PathVariable("id") Integer id,
                                                     @Valid @RequestBody Category category){
            System.out.println("Updating Category " + id);
            Optional<Category> oldCategory = categoryRepository.findById(id);
            if (oldCategory == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            Category currently = oldCategory.get();
            currently.setId(category.getId());
            currently.setName(category.getName());
            currently.setDescription(category.getDescription());
            categoryRepository.save(currently);

            return new ResponseEntity<>("Updated!", HttpStatus.OK);
        }

    // Delete category
    @DeleteMapping("category/delete/{id}")
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Category> deleteCategory(@PathVariable("id") Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categoryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
