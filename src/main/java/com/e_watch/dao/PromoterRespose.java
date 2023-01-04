package com.e_watch.dao;

public class PromoterRespose {
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PromoterRespose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PromoterRespose(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "PromoterRespose [id=" + id + ", name=" + name + "]";
	}

}