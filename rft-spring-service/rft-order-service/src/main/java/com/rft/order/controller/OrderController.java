package com.rft.order.controller;

import com.rft.order.service.OrderService;
import com.rft.spring.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rft/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder")
    public Response getOrder(){
        return orderService.getOrder();
    }
}
