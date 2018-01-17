/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor,
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.jianzhang.utils.message;

import org.apache.commons.httpclient.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 响应实体类
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
public class ResponseEntity extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public ResponseEntity() {
		put("code", 0);
	}

	public static ResponseEntity error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}

	public static ResponseEntity error(String msg) {

		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}

	public static ResponseEntity error(int code, String msg) {
		ResponseEntity r = new ResponseEntity();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static ResponseEntity ok(String msg) {
		ResponseEntity r = new ResponseEntity();
		r.put("msg", msg);
		return r;
	}

	public static ResponseEntity ok(Map<String, Object> map) {
		ResponseEntity r = new ResponseEntity();
		r.putAll(map);
		return r;
	}

	public static ResponseEntity ok() {
		return new ResponseEntity();
	}

	public ResponseEntity put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public ResponseEntity data(Object value) {
		super.put("data", value);
		return this;
	}

	public static ResponseEntity apiError(String msg) {
		return error(1, msg);
	}
}