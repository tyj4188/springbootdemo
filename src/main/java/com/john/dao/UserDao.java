/* 
 * 项目名：	com.john.dao
 * 文件名：	UserDao
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.dao;

import com.john.entity.User;

import java.util.List;

/**
 * @author ihui
 * @date 2017/11/2
 */
public interface UserDao {
    public List<User> getAllUserList() throws Exception;
}
