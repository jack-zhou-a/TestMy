package com.dao;

import java.util.List;

import com.po.Orders;

public interface OrderDao {
	//查询所有订单及明细信息
	public List<Orders> findAllOrder();

}
