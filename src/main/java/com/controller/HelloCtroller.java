package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCtroller {

	
	@RequestMapping("/getJson")
	@ResponseBody
	public Map<String,Object> getJson(){
		System.out.println("getJson=====");
		Map map=new HashMap();
		map.put("张三","29");
		map.put("lisi", "28");
		return map;
	}
}
