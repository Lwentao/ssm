package com.study.bean;

import java.util.Date;


public class Orders {
	private Integer id;

	private User userId;

	private String number;

	private Date createtime;

	private String note;

	public Integer getId() {
		return id;
	}

	public User getUserId() {
		return userId;
	}

	public String getNumber() {
		return number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public String getNote() {
		return note;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
