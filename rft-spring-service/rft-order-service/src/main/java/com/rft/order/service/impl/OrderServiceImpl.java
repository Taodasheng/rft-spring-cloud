package com.rft.order.service.impl;

import com.rft.feign.service.UserServiceFeign;
import com.rft.order.service.OrderService;
import com.rft.spring.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserServiceFeign userServiceFeign;

    @Override
    public Response getOrder() {
        return Response.Ok("订单完成");
    }
}
