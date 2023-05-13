package com.example.shopping_platform.service.ifs;

public interface OrderService {

	public void addOrder(int orderNumber , String account , String orderInfo,int payWay,
			int deliveryWay);
	
	
}
