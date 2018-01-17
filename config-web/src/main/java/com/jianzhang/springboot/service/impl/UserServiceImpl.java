package com.jianzhang.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.jianzhang.springboot.dao.UserMapper;
import com.jianzhang.springboot.entity.User;
import com.jianzhang.springboot.service.BaseService;
import com.jianzhang.springboot.service.UserService;
import com.jianzhang.utils.page.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 用户服务层实现类
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
@Service
@Slf4j
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryUserByPage(Page<User> page) {

		PageHelper.startPage(page.getPage(), page.getRows());
		return userMapper.queryUserByPage(page.getCondition());
	}
}
