/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor,
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.jianzhang.utils.page;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Description: 分页工具类
 * @author Jian Jang
 * @version 1.0 2017/12/28
 */
public class Page<T> implements Serializable {
	private int page; // 当前页
	private int rows; // 每页多少条
	private static final long serialVersionUID = 1L;
	private List<T> records = Collections.emptyList();
	private Map<String, Object> condition;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page <= 0) {
			page = 1;
		}
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		if (rows < 10) {
			rows = 10;
		}
		this.rows = rows;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public Map<String, Object> getCondition() {
		return condition;
	}

	public void setCondition(Map<String, Object> condition) {
		this.condition = condition;
	}
}