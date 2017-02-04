package com.gizwits.logMonitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

/**
 * Created by feel on 2017/2/1.
 */
@SpringBootApplication(scanBasePackages = {"com.gizwits"})
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(App.class, args);
        while (true) {
            logger.info("info 相关日志........");
            TimeUnit.SECONDS.sleep(1);
            logger.warn("warn 相关日志........");
            TimeUnit.SECONDS.sleep(1);
            logger.error("error 相关日志........");
        }
    }

}
