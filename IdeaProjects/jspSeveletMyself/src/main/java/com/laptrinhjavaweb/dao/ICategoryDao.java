package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.CategoryModel;

import java.util.List;

public interface ICategoryDao {
    List<CategoryModel> findAll();
}
