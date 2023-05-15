package com.ebanma.cloud.rpc.utils.zk;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:54 Administrator Exp $
 */

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

public class DefaultWatcher implements Watcher {
    @Override
    public void process(WatchedEvent event) {
    }
}
