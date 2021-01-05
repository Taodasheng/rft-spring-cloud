package com.rft.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "rft-user-service")
public interface UserServiceFeign {

    @GetMapping("/rft/user/getUser")
    public String getUser();
}
