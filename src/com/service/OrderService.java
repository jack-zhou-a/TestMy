package com.service;

import java.util.List;

import com.po.Orders;

public interface OrderService {

	//查询所有订单及明细信息
		public List<Orders> findAllOrder();
}
