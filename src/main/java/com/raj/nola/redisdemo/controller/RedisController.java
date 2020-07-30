package com.raj.nola.redisdemo.controller;

import com.raj.nola.redisdemo.sender.RedisSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	private RedisSender sender;

	@GetMapping(value="test")
	public String sendDataToRedisQueue(@RequestParam("input") String input) {
		System.out.println("inout-->"+input);
		sender.sendDataToRedisQueue(input);
		return "successfully sent";
	}
}
