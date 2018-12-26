package com.ntl.ishanya.LimitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitController {
	
	@Autowired
	Configuration config;

	@GetMapping("/limit")
	public Configuration getConfig() {
	//	LimitConfiguration limitConfig=new LimitConfiguration(0, 0);
		Configuration configure=new Configuration(config.getMinimum(),config.getMaximum());
		return configure;
	}

	@GetMapping("/fault-limit")
	@HystrixCommand(fallbackMethod="fallbackConfig")
	public Configuration faultGetConfig() {
		throw new RuntimeException("Not available");
	}


	public Configuration fallbackConfig() {
		System.out.println("faultout");
		return new Configuration(9, 9999);
	}


}
