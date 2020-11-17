package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.ICategoryDao;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.service.INewCategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements INewCategoryService {


    @Inject
    private ICategoryDao categoryDao;

    @Override
    public List<CategoryModel> findAll() {
        return null;
    }
}
