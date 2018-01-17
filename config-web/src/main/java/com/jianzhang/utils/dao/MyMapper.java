/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor,
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.jianzhang.utils.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: 通用Mapper都可以极大的方便开发人员,对单表封装了许多通用方法，省掉自己写增删改查的sql
 * 通用Mapper插件网址：https://github.com/abel533/Mapper
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
	// FIXME 特别注意，该接口不能被扫描到，否则会出错
}