package com.example.source.config;

import com.example.source.entities.Order;
import com.example.source.entities.User;
import com.example.source.repository.OrderRepository;
import com.example.source.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository userRepository;
    private OrderRepository orderRepository;

    @Autowired
    public TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null , "Maria Brown", "maria@gmail.com", "98888888", "123456");
        User u2 = new User(null , "Vinicius", "vinicius@gmail.com", "98888889", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);


        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
