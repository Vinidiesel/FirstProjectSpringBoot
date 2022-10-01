package com.example.source.services;

import com.example.source.entities.Order;
import com.example.source.entities.User;
import com.example.source.repository.OrderRepository;
import com.example.source.repository.UserRepository;
import com.example.source.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return  repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

}
