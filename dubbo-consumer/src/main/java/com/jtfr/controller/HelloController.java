package com.jtfr.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.HelloService;

@RestController
public class HelloController {

	// version 必填，多个项目版本的情况下，通过 dubbo.version 区分
	@Reference(version = "${dubbo.version}")
	private HelloService helloService;

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return helloService.sayHello(name);
	}
}
