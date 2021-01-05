package com.rft.user.service.impl;

import com.rft.feign.service.OrderServiceFeign;
import com.rft.spring.base.Response;
import com.rft.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    OrderServiceFeign orderServiceFeign;


    @Override
    public Response gerUser() {
        System.out.println(orderServiceFeign.getOrder());
        return Response.Ok("我是小明");
    }
}
