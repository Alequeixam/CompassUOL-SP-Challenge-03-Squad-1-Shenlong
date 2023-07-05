package br.com.compassuol.pb.challenge.msproduct.service;

import br.com.compassuol.pb.challenge.msproduct.entity.Category;
import br.com.compassuol.pb.challenge.msproduct.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
