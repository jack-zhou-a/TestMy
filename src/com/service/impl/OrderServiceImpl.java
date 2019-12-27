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

	//����ע��OrderDao
	@Autowired
	private OrderDao orderDao;

	
	//��ѯ���ж�������ϸ��Ϣ	
	@Override
	public List<Orders> findAllOrder() {
		List<Orders> findAllOrder = orderDao.findAllOrder();
		return findAllOrder;
	}

}
