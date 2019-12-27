package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.po.Orders;
import com.service.OrderService;

public class Test extends test1{
	public static void main(String[] args) {
	
	}
	public static void test() {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		OrderService or=app.getBean(OrderService.class);
		List<Orders> allOrder = or.findAllOrder();
		for(Orders o:allOrder) {
			System.out.println(o.getOrderremark());
		}
		
	}

}
