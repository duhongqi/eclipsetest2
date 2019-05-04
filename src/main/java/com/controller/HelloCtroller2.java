package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  //要求的是返回是json格式，相当于controller+responsebody
public class HelloCtroller2 {

	
	@RequestMapping("/getJson2")
	public Map<String,Object> getJson(){
		System.out.println("getJson2=====");
		Map map=new HashMap();
		map.put("张三","29");
		map.put("lisi", "28");
		return map;
	}
}
