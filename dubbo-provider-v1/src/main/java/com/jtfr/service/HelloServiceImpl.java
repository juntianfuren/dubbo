package com.jtfr.service;

import com.jtfr.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${dubbo.version}")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name +" v1.0";
	}

}
