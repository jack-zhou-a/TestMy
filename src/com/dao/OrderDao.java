package com.dao;

import java.util.List;

import com.po.Orders;

public interface OrderDao {
	//��ѯ���ж�������ϸ��Ϣ
	public List<Orders> findAllOrder();

}
