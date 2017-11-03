/* 
 * 项目名：	com.john.rowmapper
 * 文件名：	UserRowMapper
 * 模块说明：	
 * 修改历史：
 * 2017/11/2 - ihui - 创建。
 */

package com.john.rowmapper;

import com.john.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ihui
 * @date 2017/11/2
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserCode(resultSet.getString("user_code"));
        user.setUserName(resultSet.getString("user_name"));
        return user;
    }
}
