/* 
 * 项目名：	com.john.config.session
 * 文件名：	SessionConfig
 * 模块说明：	
 * 修改历史：
 * 2017/11/3 - ihui - 创建。
 */

package com.john.config.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author ihui
 * @date 2017/11/3
 * maxInactiveIntervalInSeconds: 设置Session失效时间，使用Redis Session之后，原Spring Boot的server.session.timeout属性不再生效。
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
}
