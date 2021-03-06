package com.young.wuxia.server.service;

import com.young.wuxia.server.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bin.yao on 2017/4/21.
 */
@Service
public class AccessService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User login(User user){

        String sql = "select * from wuxia_user where username=? and password=?";
        String[] args = {user.getUsername(), user.getPassword()};
        List<User> result = jdbcTemplate.queryForList(sql, args, User.class);
        if(result.size() > 0){
            return result.get(0);
        } else {
            return new User();
        }
    }
}
