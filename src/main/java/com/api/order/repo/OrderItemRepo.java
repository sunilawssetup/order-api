package com.api.order.repo;

import com.api.order.dto.OrderIteamDto;
import com.api.order.model.OrderIteam;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OrderItemRepo extends JpaRepository<OrderIteam, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE OrderIteam SET orderStatus=:orderStatus WHERE orderId=:orderId ")
    public Integer  updateOrderStatus(Long orderId, String orderStatus);
}
