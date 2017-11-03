/* 
 * 项目名：	com.john.config.cache
 * 文件名：	RedisConn
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.config.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ihui
 * @date 2017/11/2
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")

public class RedisConn {
    private String host;

    private int port;

    private int timeout;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
