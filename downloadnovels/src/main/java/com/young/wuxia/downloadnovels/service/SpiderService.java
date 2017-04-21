package com.young.wuxia.downloadnovels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by bin.yao on 2017/4/20.
 */
@Service
public class SpiderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(String name, String son_href) {
        jdbcTemplate.update("insert into spider_home(name, son_href) values(?, ?)", name, son_href);
    }
}
