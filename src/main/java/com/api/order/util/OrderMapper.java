package com.api.order.util;

import com.api.order.dto.OrderIteamDto;
import com.api.order.model.OrderIteam;

public class OrderMapper {

    public static OrderIteam OrderItemMapByOrderItemDto(OrderIteamDto orderIteamDto){

        OrderIteam orderIteam=new OrderIteam();
        orderIteam.setOrderId(orderIteamDto.getOrderId());
        orderIteam.setCustomerId(orderIteamDto.getCustomerId());
        orderIteam.setMenuId(orderIteamDto.getMenuId());
        orderIteam.setQty(orderIteamDto.getQty());
        orderIteam.setOrderStatus(orderIteamDto.getOrderStatus());
        orderIteam.setPaymentStatus(orderIteamDto.getPaymentStatus());
        orderIteam.setHotelId(orderIteamDto.getHotelId());
        return orderIteam;
    }

    public static OrderIteamDto OrderItemDtoMapByOrderItem(OrderIteam orderItem){

        OrderIteamDto orderItemDto=new OrderIteamDto();
        orderItemDto.setOrderId(orderItem.getOrderId());
        orderItemDto.setCustomerId(orderItem.getCustomerId());
        orderItemDto.setMenuId(orderItem.getMenuId());
        orderItemDto.setQty(orderItem.getQty());
        orderItemDto.setOrderStatus(orderItem.getOrderStatus());
        orderItemDto.setPaymentStatus(orderItem.getPaymentStatus());
        orderItemDto.setHotelId(orderItem.getHotelId());
        return orderItemDto;
    }
}
