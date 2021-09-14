package com.example.demo;
import com.example.demo.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class RepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void getAll() {
        System.out.println("getAll: " + customerRepository.getAll());
    }
    @Test
    public void add() {
        customerRepository.addCustomer("Vu",22);
    }
    @Test
    public void update() {
        customerRepository.updateCustomer(1, "Update ");
    }
    @Test
    public void delete() {
        customerRepository.deleteCustomerById(1);
    }
}
