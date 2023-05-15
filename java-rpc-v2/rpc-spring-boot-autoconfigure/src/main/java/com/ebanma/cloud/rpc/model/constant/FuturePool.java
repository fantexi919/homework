package com.ebanma.cloud.rpc.model.constant;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:46 Administrator Exp $
 */

import com.ebanma.cloud.rpc.model.RpcFuture;
import com.ebanma.cloud.rpc.model.RpcResponse;

import java.util.HashMap;

public class FuturePool {

    /**
     * 异步结果暂存
     */
    public static HashMap<String, RpcFuture<RpcResponse>> pool = new HashMap();

    public static void put(String key, RpcFuture future) {
        pool.put(key, future);
    }

    public static RpcFuture<RpcResponse> get(String key) {
        return pool.get(key);
    }

    public static void remove(String key) {
        pool.remove(key);
    }
}