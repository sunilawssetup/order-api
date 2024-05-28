package com.api.order.repo;

import com.api.order.model.OrderIteam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderIteam,Long> {
}
