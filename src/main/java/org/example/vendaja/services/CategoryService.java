package org.example.vendaja.services;

import org.example.vendaja.dto.CategoryDTO;
import org.example.vendaja.entities.Category;
import org.example.vendaja.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> list = repository.findAll();

        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id){
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.get();
        return new CategoryDTO(entity);
    }
}
