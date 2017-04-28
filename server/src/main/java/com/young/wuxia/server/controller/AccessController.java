package com.young.wuxia.server.controller;

import com.young.wuxia.server.domain.User;
import com.young.wuxia.server.service.AccessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bin.yao on 2017/4/12.
 */
@Controller
@RequestMapping("/access")
public class AccessController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccessService accessService;

    @RequestMapping("/login")
    @ResponseBody
    User get(User user){
        logger.info("ddd");
//        return accessService.login(user);
        return null;
    }
}
