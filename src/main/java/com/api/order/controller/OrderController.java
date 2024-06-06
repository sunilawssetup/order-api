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
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Operation(summary = "getAllOrders", description = "here we are get all orders detail")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS IS OK")
    @GetMapping("/getALlOrders")
    public List<OrderIteamDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Operation(summary = "updateOrderStatus", description = "here we are update order status")
    @ApiResponse(responseCode = "200", description = "HTTP STATUS IS OK")
    @PostMapping("/updateOrderStatus/{orderId}")
    public OrderIteamDto updateOrderStatus(@PathVariable("orderId") Long orderId, @RequestParam("orderStatus") String orderStatus) {
        return orderService.updateOrderStatus(orderId, orderStatus);

    }
}
