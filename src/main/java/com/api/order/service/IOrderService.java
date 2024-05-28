package com.api.order.service;

import com.api.order.dto.OrderIteamDto;

public interface IOrderService {
    public OrderIteamDto bookOrder(OrderIteamDto orderIteamDto);
}
