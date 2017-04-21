package com.young.wuxia.downloadnovels;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.pipeline.PipelineFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/12.
 */
@SpringBootApplication
@Controller
@RequestMapping
public class Application {

    @Autowired
    private PipelineFactory springPipelineFactory;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("")
    public void startSpider(){
        GeccoEngine.create()
                //工程的包路径
                .classpath("com.young.wuxia.downloadnovels")
                .debug(false)
                .pipelineFactory(springPipelineFactory)
                //开始抓取的页面地址
//                .start("http://www.wuxiaworld.com")
                .start("http://www.wuxiaworld.com/cdindex-html/book-1-chapter-1/")
                //开启几个爬虫线程
                .thread(10)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(1)
                //循环抓取
                .loop(false)
                //使用pc端userAgent
                .mobile(false)
                //非阻塞方式运行
                .start();
    }

}
