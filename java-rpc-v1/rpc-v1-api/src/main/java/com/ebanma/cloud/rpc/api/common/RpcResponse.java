package com.ebanma.cloud.rpc.api.common;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/05/15 10:05 Administrator Exp $
 */

import lombok.Data;

/**
 * 封装的响应对象
 */
@Data
public class RpcResponse {

    /**
     * 响应ID
     */
    private String requestId;

    /**
     * 返回的结果
     */
    private Object returnValue;

}
