package com.jianzhang.springboot.service;

import com.jianzhang.utils.page.Page;
import com.jianzhang.springboot.entity.User;

import java.util.List;

/**
 * @Description: 用户服务层接口
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
public interface UserService extends IService<User> {
	public List<User> queryUserByPage(Page<User> page);
}
