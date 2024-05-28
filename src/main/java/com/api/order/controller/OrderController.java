package com.api.order.controller;

import com.api.order.dto.OrderIteamDto;
import com.api.order.service.IOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "order-api",
        description = "this api can operation booking order"
)
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @Operation(
            summary = "book order",
            description = "this can help book food order"
    )
    @ApiResponse(
            responseCode = "201",
            description = "booking ordered",
            content = @Content(
                    schema = @Schema(
                            implementation = OrderIteamDto.class
                    )
            )
    )
    @PostMapping("/bookOrder")
    public OrderIteamDto bookOrder(@RequestBody OrderIteamDto orderIteamDto) {

        return orderService.bookOrder(orderIteamDto);
    }
}
