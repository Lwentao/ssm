package com.study.bean;

public class Orderdetail {
	private Integer id;

	private Orders ordersId;

	private Items itemsId;

	private Integer itemsNum;

	public Integer getId() {
		return id;
	}

	public Orders getOrdersId() {
		return ordersId;
	}

	public Items getItemsId() {
		return itemsId;
	}

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setOrdersId(Orders ordersId) {
		this.ordersId = ordersId;
	}

	public void setItemsId(Items itemsId) {
		this.itemsId = itemsId;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}
	
}
