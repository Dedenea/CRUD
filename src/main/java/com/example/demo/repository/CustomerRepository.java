package com.example.demo.repository;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    @Query(value = "select * from customer", nativeQuery = true)
    List<Customer> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into customer(name,age) values(?1,?2)", nativeQuery = true)
    void addCustomer(String name, int age);

    @Transactional
    @Modifying
    @Query(value = "update customer set name = ?2 where id = ?1", nativeQuery = true)
    void updateCustomer(Integer id, String name);

    @Transactional
    @Modifying
    @Query(value = "delete from customer where id = ?1", nativeQuery = true)
    void deleteCustomerById(Integer id);
}
