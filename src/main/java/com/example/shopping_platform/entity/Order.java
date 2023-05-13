package com.example.shopping_platform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    //交由spring 作託管
@Table(name = "bank")  //告訴spring 此類別要與資料庫哪個Table作關聯
public class Order {
	
    @Id   //mysql裡面的主鍵 PK(Primary Key)
	@Column(name = "order_number")
	private int orderNumber;
    
    @Column(name = "account")  //將類別中的屬性跟Table中的欄位作關聯
	private String account;

	@Column(name = "orderInfo")
	private String orderInfo;

	@Column(name = "pay_way")
	private int payWay;
	
	@Column(name = "delivery_way")
	private int deliveryWay;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public int getPayWay() {
		return payWay;
	}

	public void setPayWay(int payWay) {
		this.payWay = payWay;
	}

	public int getDeliveryWay() {
		return deliveryWay;
	}

	public void setDeliveryWay(int deliveryWay) {
		this.deliveryWay = deliveryWay;
	}
	
	
}
