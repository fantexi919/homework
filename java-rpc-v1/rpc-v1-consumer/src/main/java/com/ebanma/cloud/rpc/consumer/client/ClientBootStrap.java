package com.ebanma.cloud.rpc.consumer.client;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:12 Administrator Exp $
 */

import com.ebanma.cloud.rpc.api.UserApi;
import com.ebanma.cloud.rpc.consumer.proxy.RpcClientProxy;
import com.ebanma.cloud.rpc.api.dto.UserInfoDTO;

/**
 * 测试类
 */
public class ClientBootStrap {
    public static void main(String[] args) {
        UserApi userService = (UserApi) RpcClientProxy.createProxy(UserApi.class);
        UserInfoDTO user = userService.getById(1);
        System.out.println(user);
    }
}