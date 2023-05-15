package com.ebanma.cloud.rpc.provider;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/05/15 10:09 Administrator Exp $
 */

import com.ebanma.cloud.rpc.provider.server.RpcServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerBootstrapApplication implements CommandLineRunner {


    @Autowired
    private RpcServer rpcServer;

    public static void main(String[] args) {
        SpringApplication.run(ServerBootstrapApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                rpcServer.startServer("127.0.0.1", 8899);
            }
        }).start();
    }
}
