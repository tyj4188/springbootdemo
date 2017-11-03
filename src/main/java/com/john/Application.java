/* 
 * 项目名：	com.john
 * 文件名：	StartController
 * 模块说明：	
 * 修改历史：
 * 2017/11/1 - ihui - 创建。
 */

package com.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author ihui
 * @date 2017/11/1
 */
@SpringBootApplication // 等同于@Configuration @EnableAutoConfiguration @ComponentScan
@EnableCaching
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
