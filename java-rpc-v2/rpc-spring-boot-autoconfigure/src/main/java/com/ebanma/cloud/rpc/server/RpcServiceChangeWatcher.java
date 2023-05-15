package com.ebanma.cloud.rpc.server;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:54 Administrator Exp $
 */

import com.ebanma.cloud.rpc.client.NettyClientGroup;
import com.ebanma.cloud.rpc.config.properties.RpcProperties;
import com.ebanma.cloud.rpc.utils.zk.ZKServer;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//@Getter
//@Setter
public class RpcServiceChangeWatcher implements Watcher, ApplicationContextAware {

    // IOC容器
    private ApplicationContext applicationContext;

    private RpcProperties rpcProperties;
    private NettyClientGroup nettyClientGroup;
    private ZKServer zkServer;

    private String listenProviderPath;

    @Override
    public void process(WatchedEvent event) {
        System.out.println(event);

// 实际业务
        try {
            nettyClientGroup.refreshProviders();
        } catch (Exception e) {
            e.printStackTrace();
        }

// 重新监听
        String providersPath = rpcProperties.getPath() + rpcProperties.getProviderPath();
        try {
            zkServer.getZk().getChildren(providersPath, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        this.rpcProperties = applicationContext.getBean(RpcProperties.class);
        this.nettyClientGroup = applicationContext.getBean(NettyClientGroup.class);
        this.zkServer = applicationContext.getBean(ZKServer.class);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public RpcProperties getRpcProperties() {
        return rpcProperties;
    }

    public void setRpcProperties(RpcProperties rpcProperties) {
        this.rpcProperties = rpcProperties;
    }

    public NettyClientGroup getNettyClientGroup() {
        return nettyClientGroup;
    }

    public void setNettyClientGroup(NettyClientGroup nettyClientGroup) {
        this.nettyClientGroup = nettyClientGroup;
    }

    public ZKServer getZkServer() {
        return zkServer;
    }

    public void setZkServer(ZKServer zkServer) {
        this.zkServer = zkServer;
    }

    public String getListenProviderPath() {
        return listenProviderPath;
    }

    public void setListenProviderPath(String listenProviderPath) {
        this.listenProviderPath = listenProviderPath;
    }
}
