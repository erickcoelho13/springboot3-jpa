package com.coelhospring.course.services;

import com.coelhospring.course.entities.Order;
import com.coelhospring.course.entities.User;
import com.coelhospring.course.repositories.OrderRepository;
import com.coelhospring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }


}
