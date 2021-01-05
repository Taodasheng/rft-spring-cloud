package com.rft.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "rft-order-service")
public interface OrderServiceFeign {

    @GetMapping("/rft/order/getOrder")
    public String getOrder();
}
