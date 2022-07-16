package com.spring.assignmentspring_boot.service;

import com.spring.assignmentspring_boot.Repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
