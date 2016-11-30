package com.taotao.common.pojo;

import java.util.List;

/*
 * 该pojo用来接收分页参数的，一个是page一个是rows。调用dao查询商品列表。并分页。返回商品列表。
返回一个EasyUIDateGrid支持的数据格式
 * */
public class EUDataGridResult {

	private long total;
	private List<?> rows;// ?任意类型

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
