package com.po;

import java.util.List;

public class Orders {
	private int id;
	private String ordername;
	private String orderremark;
	private List<Orderdetail> orderdetails; 
	
	
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderremark() {
		return orderremark;
	}
	public void setOrderremark(String orderremark) {
		this.orderremark = orderremark;
	}
	
}
