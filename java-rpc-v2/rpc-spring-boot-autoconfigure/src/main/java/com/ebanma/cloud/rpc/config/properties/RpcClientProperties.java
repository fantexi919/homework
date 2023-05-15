package com.ebanma.cloud.rpc.config.properties;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:48 Administrator Exp $
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rpc.client")
//@Getter
//@Setter
public class RpcClientProperties {

    /**
     * 服务提供者名称
     */
    private String consumerName = "";

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
}
