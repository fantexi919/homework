package com.ebanma.cloud.rpc.model;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/05/15 10:44 Administrator Exp $
 */

import lombok.Data;

@Data
public class ProviderBean {
    /**
     * 服务名称
     */
    private String name;
    /**
     * 服务地址，格式：ip:port
     */
    private String address;
    /**
     * 权重，越大优先级越高
     */
    private Integer weight;
}
