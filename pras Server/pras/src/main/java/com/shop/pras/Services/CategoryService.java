package com.shop.pras.Services;

import com.shop.pras.Models.Base;
import com.shop.pras.Models.Category;
import com.shop.pras.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(String name, Base base) {
        Category category = new Category(name, base);
        return categoryRepository.save(category);
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> findByBase(Base base) {
        return categoryRepository.findByBase(base);
    }

    public List<Category> findByBaseLogin(String baseLogin) {
        return categoryRepository.findByBase_BaseLogin(baseLogin);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
