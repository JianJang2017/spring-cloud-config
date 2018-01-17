package com.jianzhang.springboot.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 正常情况下具体业务是每个模块的service里面定义许多方法，然后mapper中实现。
 * 
 *  但是博主查看插件文档后发现一个通用Mapper在Spring4中的最佳用法。那就是通用的Service
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
public interface IService<T> {

	T selectByKey(Object key);

	int save(T entity);

	int delete(Object key);

	int updateAll(T entity);

	int updateNotNull(T entity);

	List<T> selectByExample(Object example);

}