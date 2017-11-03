/* 
 * 项目名：	com.john.test.service
 * 文件名：	UserServiceTest
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.test.service;

import com.alibaba.fastjson.JSONObject;
import com.john.entity.User;
import com.john.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author ihui
 * @date 2017/11/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private UserService userService;

    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void queryUserList() throws Exception {
        List<User> list = userService.getAllUserList();
        logger.info(JSONObject.toJSONString(list));
    }

}
