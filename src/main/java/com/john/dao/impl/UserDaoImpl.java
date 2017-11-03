/* 
 * 项目名：	com.john.dao.impl
 * 文件名：	UserDaoImpl
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.dao.impl;

import com.john.dao.UserDao;
import com.john.entity.User;
import com.john.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ihui
 * @date 2017/11/2
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<User> getAllUserList() throws Exception {
        List<User> list = new ArrayList<User>();
        String sql = "select * from users";
        list = template.query(sql, new UserRowMapper());
        return list;
    }
}
