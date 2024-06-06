package com.api.order.service;

import com.api.order.dto.OrderIteamDto;

import java.util.List;

public interface IOrderService {
    public OrderIteamDto bookOrder(OrderIteamDto orderIteamDto);

    public List<OrderIteamDto> getAllOrders();

    public OrderIteamDto updateOrderStatus(Long orderId, String orderStatus);
}
