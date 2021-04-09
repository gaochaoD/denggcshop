package com.denggc3.config.threadpool;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author denggc3
 */
@Component
public class AsycTask {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Async
    @Scheduled(cron = "0/20 * * * * ?")
    public void method1(){

        logger.info(System.currentTimeMillis()+"method1 start run");
        System.out.println("异步线程:"+Thread.currentThread().getName());
        logger.info(System.currentTimeMillis()+"method1 end run");
    }


    @Async
    @Scheduled(cron = "0/30 * * * * ?")
    public void method2(){

        logger.info(System.currentTimeMillis()+"method2 start run");
        System.out.println("异步线程:"+Thread.currentThread().getName());
        logger.info(System.currentTimeMillis()+"method2 end run");
    }


}
