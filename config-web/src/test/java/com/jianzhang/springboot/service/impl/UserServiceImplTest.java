package com.jianzhang.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jianzhang.springboot.SpringbootWebApplicationTests;
import com.jianzhang.springboot.entity.User;
import com.jianzhang.springboot.service.UserService;
import com.jianzhang.utils.page.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@Slf4j
public class UserServiceImplTest extends SpringbootWebApplicationTests {
	@Autowired
	private UserService userService;

	@Test
	public void queryUserByPage() throws Exception {
		Page<User> page = new Page<>();
		Map<String, Object> condition = new HashMap<>();
		condition.put("name", "zhangjian");
		page.setCondition(condition);
		List<User> list = userService.queryUserByPage(page);
		System.out.print("size=================" + list.size());
		log.info("userList:", list.get(0).getName());
	}

	@Test
	public void delete() throws Exception {
		User user = new User();
		user.setId(3);
		userService.delete(user);
	}
}