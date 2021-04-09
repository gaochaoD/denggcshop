package com.denggc3.config.threadpool;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @author denggc3
 */
@Data
@ConfigurationProperties(prefix = "task.pool")
public class ThreadPoolConfig {

    /**
     * 核心线程池大小
     */
    private int corePoolSize;

    /**
     * 最大线程数
     */
    private int maxPoolSize;

    /**
     * 活跃时间
     */
    private int keepAliveSeconds;

    /**
     * 队列容量
     */
    private int queueCapacity;

}
