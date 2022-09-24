package com.example.source.repository;

import com.example.source.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long> {
}
