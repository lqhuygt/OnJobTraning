package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.CategoryDto;
import com.laptrinhjavaweb.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public CategoryDto toDto (CategoryEntity entity){
        CategoryDto result = new CategoryDto();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setCode(entity.getCode());
        return result;
    }

    public CategoryEntity toEntity (CategoryDto dto){
        CategoryEntity result = new CategoryEntity();
        result.setName(dto.getName());
        result.setCode(dto.getCode());
        return result;
    }
}
