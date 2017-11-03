/* 
 * 项目名：	com.john.test.cache
 * 文件名：	CacheTest
 * 模块说明：	
 * 修改历史：
 * 2017/11/3 - ihui - 创建。
 */

package com.john.test.cache;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author ihui
 * @date 2017/11/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class CacheTest {

    @Autowired
    private StringRedisTemplate template;

    @Test
    public void cacheTest() {
        template.opsForValue().set("yoodb", "123");
        Assert.assertEquals("123", template.opsForValue().get("yoodb"));
    }
}
