package com.api.order.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_orderItem")
public class OrderIteam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private Long customerId;
    private Long hotelId;
    private Long menuId;
    private Long qty;
    private String paymentStatus;
    private String orderStatus;

}
