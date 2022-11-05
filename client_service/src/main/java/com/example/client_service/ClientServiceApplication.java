package com.example.client_service;

import com.example.client_service.Repository.CustomerRepository;
import com.example.client_service.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start (CustomerRepository customerRepository){
    return args ->{
        customerRepository.save(new Customer(null,"Mohamed","MM@gmail.com"));
        customerRepository.save(new Customer(null,"imane","MM@gmail.com"));
        customerRepository.save(new Customer(null,"Chorouk","MM@gmail.com"));

    };
    }
}
