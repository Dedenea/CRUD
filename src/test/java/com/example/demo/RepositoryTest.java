package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void getAll(){
        System.out.println("getAll: " + customerRepository.findAll());
    }
    @Test
    public void add() {
        Customer customer = Customer.builder().name("Add").build();
        System.out.println("Them Customer: " + customerRepository.save(customer));
    }
    @Test
    public void update() {
        Customer customer = Customer.builder().id(1).name("Update").build();
        System.out.println("Update Customer: " + customerRepository.save(customer));
    }
    @Test
    public void delete() {
        customerRepository.deleteById(1);
    }
}
