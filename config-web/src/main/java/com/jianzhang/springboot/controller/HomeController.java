package com.jianzhang.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.jianzhang.springboot.entity.User;
import com.jianzhang.springboot.service.UserService;
import com.jianzhang.utils.message.ResponseEntity;
import com.jianzhang.utils.page.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 控制器类
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
@RestController
@Slf4j
public class HomeController {
	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String sayHello() {
		return "hello world";
	}

	@GetMapping("/users")
	public ResponseEntity queryUserList(Page<User> page) {
		page.setPage(1);
		page.setRows(10);
		Map<String, Object> conditions = new HashMap<>();
		page.setCondition(conditions);
		ResponseEntity responseEntity = new ResponseEntity();
		List<User> results = userService.queryUserByPage(page);
		responseEntity.put("results", results);
		responseEntity.put("success", "true");
		responseEntity.put("message", "操作成功");
		return responseEntity;
	}
}
