package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>Hello</h1>";
	}
	@RequestMapping(value="/bye", method=RequestMethod.GET)
	public String bye() {
		return "<h2>bye</h2>";
	}
	@RequestMapping(value="/post", method= RequestMethod.POST)
	public String post() {
		return "<h2>Post</h2>";
	}
//	클라이언트는 URL로 요청을 전송
//	요청 URL을 어떤 메서드가 처리할지 여부를 결정하는 것이 “@RequestMapping“
	@PostMapping("post2")
	public String post2() {
		return "<h1>Post2</h1>";
	}
}
