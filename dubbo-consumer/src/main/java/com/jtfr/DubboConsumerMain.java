package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableAutoConfiguration // 开启自动扫描
@EnableDubbo
public class DubboConsumerMain {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerMain.class, args);
	}
}
