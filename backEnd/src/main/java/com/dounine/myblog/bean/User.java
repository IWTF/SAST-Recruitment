package com.dounine.myblog.bean;

public class User {

    private String stuId; // 主键

    private String userName;
    
    private String phone;

    private String descb;

    public User() {}

    public User(String stuId, String userName, String phone,  String desc) {
    	this.stuId = stuId;
    	this.descb = desc;
        this.phone = phone;
        this.userName = userName;
    }

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescb() {
		return descb;
	}

	public void setDescb(String descb) {
		this.descb = descb;
	}

	

    
}
