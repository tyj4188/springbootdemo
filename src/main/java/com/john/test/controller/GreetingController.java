/* 
 * 项目名：	com.john.test
 * 文件名：	GreetingController
 * 模块说明：	
 * 修改历史：
 * 2017/11/1 - ihui - 创建。
 */

package com.john.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ihui
 * @date 2017/11/1
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s !";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }

        session.setAttribute("uid", uid);
        return session.getId();
    }
}
