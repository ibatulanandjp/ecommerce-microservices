package com.ibatulanand.orderservice.repository;

import com.ibatulanand.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
