package com.example.source.repository;

import com.example.source.entities.Order;
import com.example.source.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
