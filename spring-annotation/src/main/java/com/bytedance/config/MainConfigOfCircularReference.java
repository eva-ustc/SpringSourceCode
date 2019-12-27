package com.bytedance.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author liruikang
 */
@ComponentScan("com.bytedance.circularreference")
@Configuration
@EnableAsync
public class MainConfigOfCircularReference {
}
