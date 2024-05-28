package com.api.order.service.impl;

import com.api.order.dto.OrderIteamDto;
import com.api.order.repo.OrderItemRepo;
import com.api.order.service.IOrderService;
import com.api.order.util.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderItemRepo orderItemRepo;
    @Override
    public OrderIteamDto bookOrder(OrderIteamDto orderIteamDto) {
        OrderMapper.OrderItemMapByOrderItemDto(orderIteamDto);
        return OrderMapper.OrderItemDtoMapByOrderItem( orderItemRepo.save(OrderMapper.OrderItemMapByOrderItemDto(orderIteamDto)));
    }
}
