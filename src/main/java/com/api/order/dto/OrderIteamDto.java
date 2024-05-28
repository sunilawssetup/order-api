package com.api.order.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderIteamDto {
    private Long orderId;
    private Long customerId;
    private Long hotelId;
    private Long menuId;
    private Long qty;
    private String paymentStatus;
    private String orderStatus;
}