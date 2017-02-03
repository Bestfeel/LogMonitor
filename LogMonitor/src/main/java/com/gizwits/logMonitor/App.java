package com.gizwits.logMonitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by feel on 2017/2/1.
 */
@SpringBootApplication(scanBasePackages = {"com.gizwits"})
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);


    }

}
