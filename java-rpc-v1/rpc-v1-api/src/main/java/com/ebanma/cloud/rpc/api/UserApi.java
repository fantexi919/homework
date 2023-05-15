package com.ebanma.cloud.rpc.api;
/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/05/15 9:59 Administrator Exp $
 */


import com.ebanma.cloud.rpc.api.dto.UserInfoDTO;

public interface UserApi {

    UserInfoDTO getById(Integer id);
}
