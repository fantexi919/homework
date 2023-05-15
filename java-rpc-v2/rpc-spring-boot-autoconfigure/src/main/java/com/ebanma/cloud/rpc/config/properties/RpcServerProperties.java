package com.ebanma.cloud.rpc.config.properties;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:48 Administrator Exp $
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rpc.server")
//@Getter
//@Setter
public class RpcServerProperties {

    /**
     * 服务提供者名称
     */
    private String providerName = "";

    /**
     * 服务提供者端口
     */
    private Integer providerPort = 9527;

    /**
     * 权重，默认为1
     */
    private Integer weight = 1;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integer getProviderPort() {
        return providerPort;
    }

    public void setProviderPort(Integer providerPort) {
        this.providerPort = providerPort;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
