package com.e_watch.dao;

import com.e_watch.Enum.Role;

public class AppUserRespose {
	private int id;
	private String userName;
	private Role role;
	private long mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public AppUserRespose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUserRespose(int id, String userName, Role role, long mobileNumber) {
		super();
		this.id = id;
		this.userName = userName;
		this.role = role;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "AppUserRespose [id=" + id + ", userName=" + userName + ", role=" + role + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
}