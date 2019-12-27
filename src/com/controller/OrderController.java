package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Orders;
import com.service.OrderService;

@Controller
public class OrderController {

	// “¿¿µ◊¢»ÎOrderService
	@Autowired
	private OrderService orderService;

	@RequestMapping("/allOrder")
	public String findAllRole(Model model) {
		List<Orders> allOrder = orderService.findAllOrder();
//		for(Orders s:allOrder) {
//			s.get
//		}
		model.addAttribute("allOrder", allOrder);
		return "listOrder";
	}

}
