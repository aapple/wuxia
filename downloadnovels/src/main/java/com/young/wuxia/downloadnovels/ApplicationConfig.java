package com.young.wuxia.downloadnovels;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.pipeline.PipelineFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by bin.yao on 2017/4/20.
 */

public class ApplicationConfig extends SpringBootServletInitializer {

    @Autowired
    private PipelineFactory springPipelineFactory;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        GeccoEngine.create()
                //工程的包路径
                .classpath("com.young.wuxia.downloadnovels")
                .debug(false)
                .pipelineFactory(springPipelineFactory)
                //开始抓取的页面地址
                .start("http://www.wuxiaworld.com")
//                .start("http://www.wuxiaworld.com/cdindex-html/book-1-chapter-1/")
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

        return application.sources(ApplicationConfig.class);
    }
}
