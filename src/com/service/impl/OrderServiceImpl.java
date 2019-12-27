package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDao;
import com.po.Orders;
import com.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	//依赖注入OrderDao
	@Autowired
	private OrderDao orderDao;

	
	//查询所有订单及明细信息	
	@Override
	public List<Orders> findAllOrder() {
		List<Orders> findAllOrder = orderDao.findAllOrder();
		return findAllOrder;
	}

}
