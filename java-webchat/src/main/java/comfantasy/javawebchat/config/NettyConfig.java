package comfantasy.javawebchat.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/04/21 15:53 Administrator Exp $
 */
@Component
@ConfigurationProperties(prefix = "netty")
@Data
public class NettyConfig {
    private int port;//netty监听的端口
    private String path;//websocket访问路径
}
