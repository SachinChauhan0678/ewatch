package com.e_watch.dao;

import java.util.List;


public class ChannelModel {

	
	private String name;
	
	private Long promoterid;

	public ChannelModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChannelModel(String name, Long promoterid) {
		super();
		this.name = name;
		this.promoterid = promoterid;
	}

	@Override
	public String toString() {
		return "ChannelModel [name=" + name + ", promoterid=" + promoterid + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPromoterid() {
		return promoterid;
	}

	public void setPromoterid(Long promoterid) {
		this.promoterid = promoterid;
	}

	

}
