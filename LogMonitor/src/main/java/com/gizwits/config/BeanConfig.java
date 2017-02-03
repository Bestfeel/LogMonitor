package com.gizwits.config;

import com.gizwits.util.LRUCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by feel on 2017/2/2.
 */
@Configuration
public class BeanConfig {

    @Bean
    public LRUCache lruCache() {
        return new LRUCache<String, String>(1000);
    }
}
