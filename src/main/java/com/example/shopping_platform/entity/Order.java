package com.example.shopping_platform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    //���spring �@�U��
@Table(name = "bank")  //�i�Dspring �����O�n�P��Ʈw����Table�@���p
public class Order {
	
    @Id   //mysql�̭����D�� PK(Primary Key)
	@Column(name = "order_number")
	private int orderNumber;
    
    @Column(name = "account")  //�N���O�����ݩʸ�Table�������@���p
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
