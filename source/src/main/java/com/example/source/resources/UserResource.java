package com.example.source.resources;

import com.example.source.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Users> findAll() {
        Users u = new Users(1L, "Maria", "maria@gmail.com", "999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
