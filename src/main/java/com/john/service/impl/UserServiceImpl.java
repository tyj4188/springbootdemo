/* 
 * 项目名：	com.john.service.impl
 * 文件名：	UserServiceImpl
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.service.impl;

import com.john.dao.UserDao;
import com.john.entity.User;
import com.john.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ihui
 * @date 2017/11/2
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUserList() throws Exception {
        return userDao.getAllUserList();
    }
}
