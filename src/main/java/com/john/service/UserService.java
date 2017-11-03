/* 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 
 * 项目名：	com.john.service
 * 文件名：	UserService
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.service;

import com.john.entity.User;

import java.util.List;

/**
 * @author ihui
 * @date 2017/11/2
 */
public interface UserService {
    List<User> getAllUserList() throws Exception;
}
