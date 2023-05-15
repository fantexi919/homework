package com.ebanma.cloud.rpc.provider.service.impl;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/05/15 10:06 Administrator Exp $
 */

import com.ebanma.cloud.rpc.api.UserApi;
import com.ebanma.cloud.rpc.api.dto.UserInfoDTO;
import com.ebanma.cloud.rpc.provider.annotation.RpcService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RpcService
@Service
public class UserServiceImpl implements UserApi {
    Map<Object, UserInfoDTO> userMap = new HashMap();

    @Override
    public UserInfoDTO getById(Integer id) {
        if (userMap.size() == 0) {
            UserInfoDTO user1 = new UserInfoDTO();
            user1.setId(1);
            user1.setName("张三");
            UserInfoDTO user2 = new UserInfoDTO();
            user2.setId(2);
            user2.setName("李四");
            userMap.put(user1.getId(), user1);
            userMap.put(user2.getId(), user2);
        }
        return userMap.get(id);
    }
}
