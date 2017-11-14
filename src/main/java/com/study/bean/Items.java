package com.study.bean;

import java.util.Date;

public class Items {
	
	private int id;
	
	private String name;
	
	private float price;
	
	private String detail;
	
	private String pic;
	
	private Date createtime;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final float getPrice() {
		return price;
	}

	public final void setPrice(float price) {
		this.price = price;
	}

	public final String getDetail() {
		return detail;
	}

	public final void setDetail(String detail) {
		this.detail = detail;
	}

	public final String getPic() {
		return pic;
	}

	public final void setPic(String pic) {
		this.pic = pic;
	}

	public final Date getCreatetime() {
		return createtime;
	}

	public final void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
