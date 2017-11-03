/* 
 * 项目名：	com.john.test
 * 文件名：	Greeting
 * 模块说明：	
 * 修改历史：
 * 2017/10/31 - ihui - 创建。
 */

package com.john.test.controller;

/**
 * @author ihui
 * @date 2017/10/31
 */
public class Greeting {

    private long id;
    private String content;

    public Greeting() {}

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
