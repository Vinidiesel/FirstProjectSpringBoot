package com.example.source.repository;

import com.example.source.entities.OrderItem;
import com.example.source.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
