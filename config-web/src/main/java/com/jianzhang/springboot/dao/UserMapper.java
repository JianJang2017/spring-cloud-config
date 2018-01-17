package com.jianzhang.springboot.dao;

import com.jianzhang.springboot.entity.User;
import com.jianzhang.utils.dao.MyMapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends MyMapper<User> {
    /**
     * 分页查询用户信息
     * @param map
     * @return
     */
    public List<User> queryUserByPage(Map<String ,Object> map);
}