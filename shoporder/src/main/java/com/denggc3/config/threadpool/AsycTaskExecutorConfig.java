package com.denggc3.config.threadpool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @author denggc3
 */
@EnableAsync(proxyTargetClass = true)
@Configuration
public class AsycTaskExecutorConfig {

    @Autowired
    private ThreadPoolConfig poolConfig;

    @Bean
    public Executor taskQueueExecutor(){


/*        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                poolConfig.getCorePoolSize(),
                poolConfig.getMaxPoolSize(),
                poolConfig.getKeepAliveSeconds(),
                TimeUnit.MICROSECONDS,
                new LinkedBlockingDeque<Runnable>(poolConfig.getQueueCapacity()),
                new ThreadPoolExecutor.DiscardPolicy()
        );*/

        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        //设置核心线程数
        executor.setCorePoolSize(poolConfig.getCorePoolSize());
        //设置最大线程数
        executor.setMaxPoolSize(poolConfig.getMaxPoolSize());
        //设置活跃时间
        executor.setKeepAliveSeconds(poolConfig.getKeepAliveSeconds());
        //设置队列容量
        executor.setQueueCapacity(poolConfig.getQueueCapacity());

        //设置线程默认名称
        executor.setThreadNamePrefix("task_Queue_Exexutor-");

        //对拒绝任务的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        executor.initialize();

        //所有任务执行完成后关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(true);

        return executor;
    }

}
