package com.example.source.config;

import com.example.source.entities.User;
import com.example.source.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null , "Maria Brown", "maria@gmail.com", "98888888", "123456");
        User u2 = new User(null , "Vinicius", "vinicius@gmail.com", "98888889", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
