package com.young.wuxia.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bin.yao on 2017/4/12.
 */
@Controller
public class GoodsController {

    @RequestMapping("/get")
    @ResponseBody
    String get(){
        return "hello!";
    }
}
