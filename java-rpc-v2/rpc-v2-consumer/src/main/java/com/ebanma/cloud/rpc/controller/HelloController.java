package com.ebanma.cloud.rpc.controller;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 11:07 Administrator Exp $
 */


import com.ebanma.cloud.rpc.annotation.RpcReference;
import com.ebanma.cloud.rpc.api.UserApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    // 自定义注解，其中value为服务提供者名称，类似OpenFeign的使用
    @RpcReference("provider01")
    private UserApi userApi;

    @GetMapping("/index/{id}")
    public Object hello(@PathVariable Integer id) {
        return userApi.getById(id);
    }
}
