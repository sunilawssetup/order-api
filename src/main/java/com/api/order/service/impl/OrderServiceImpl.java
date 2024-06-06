package com.api.order.service.impl;

import com.api.order.dto.OrderIteamDto;
import com.api.order.repo.OrderItemRepo;
import com.api.order.service.IOrderService;
import com.api.order.util.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderItemRepo orderItemRepo;

    @Override
    public OrderIteamDto bookOrder(OrderIteamDto orderIteamDto) {
        OrderMapper.OrderItemMapByOrderItemDto(orderIteamDto);
        return OrderMapper.OrderItemDtoMapByOrderItem(orderItemRepo.save(OrderMapper.OrderItemMapByOrderItemDto(orderIteamDto)));
    }

    @Override
    public List<OrderIteamDto> getAllOrders() {
        return orderItemRepo.findAll().stream().map(orderIteam -> OrderMapper.OrderItemDtoMapByOrderItem(orderIteam)).collect(Collectors.toList());
    }

    @Override
    public OrderIteamDto updateOrderStatus(Long orderId, String orderStatus) {
        Integer  queryStatus = orderItemRepo.updateOrderStatus(orderId, orderStatus);
        if (queryStatus > 0) {
            return OrderMapper.OrderItemDtoMapByOrderItem(orderItemRepo.findById(orderId).orElseThrow(() -> new RuntimeException(("Order is Not found"))));
        }
        return null;
    }
}
