package com.ebanma.cloud.rpc.config.properties;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:47 Administrator Exp $
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rpc")
//@Getter
//@Setter
public class RpcProperties {

    /**
     * 服务注册中心地址
     */
    private String registerAddress = "127.0.0.1";

    /**
     * 服务暴露端口
     */
    private Integer serverPort = 2181;

    /**
     * 服务提供者保存地址
     */
    private String path = "/rpc";

    /**
     * 服务提供者保存地址
     */
    private String consumerPath = "/consumer";

    /**
     * 服务提供者保存地址
     */
    private String providerPath = "/provider";

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getConsumerPath() {
        return consumerPath;
    }

    public void setConsumerPath(String consumerPath) {
        this.consumerPath = consumerPath;
    }

    public String getProviderPath() {
        return providerPath;
    }

    public void setProviderPath(String providerPath) {
        this.providerPath = providerPath;
    }
}
