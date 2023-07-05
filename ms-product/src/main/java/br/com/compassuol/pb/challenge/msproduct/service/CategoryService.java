package br.com.compassuol.pb.challenge.msproduct.service;

import br.com.compassuol.pb.challenge.msproduct.entity.Category;
import br.com.compassuol.pb.challenge.msproduct.payload.CategoryDTO;
import br.com.compassuol.pb.challenge.msproduct.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    private ModelMapper mapper;

    public CategoryService(CategoryRepository categoryRepository, ModelMapper mapper) {
        this.categoryRepository = categoryRepository;
        this.mapper = mapper;
    }

    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = mapToEntity(categoryDTO);

        Category createdCategory = categoryRepository.save(category);

        return mapToDTO(createdCategory);

    }

    private CategoryDTO mapToDTO(Category category) {
        return mapper.map(category, CategoryDTO.class);
    }
    private Category mapToEntity(CategoryDTO categoryDTO) {
        return mapper.map(categoryDTO, Category.class);
    }
}
