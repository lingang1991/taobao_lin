package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long id);
	
	
	//返回一个EasyUIDateGrid支持的数据格式，接收分页参数，一个是page一个是rows。
    //调用dao查询商品列表。并分页。返回商品列表。
	EUDataGridResult getItemList(int page,int rows);
}
