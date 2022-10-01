package com.example.source.services;

import com.example.source.entities.Product;
import com.example.source.entities.User;
import com.example.source.repository.ProductRepository;
import com.example.source.repository.UserRepository;
import com.example.source.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return  repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

}
