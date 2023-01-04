package com.e_watch.dao;

import java.util.List;


import com.e_watch.entity.Promoter;

public class PlanRespose {
	
	private String name;
	private Double amountperMonth;
	private String details;
	private Float taxpercent;
	
	
	private String channelName;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getAmountperMonth() {
		return amountperMonth;
	}


	public void setAmountperMonth(Double amountperMonth) {
		this.amountperMonth = amountperMonth;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public Float getTaxpercent() {
		return taxpercent;
	}


	public void setTaxpercent(Float taxpercent) {
		this.taxpercent = taxpercent;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public PlanRespose() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PlanRespose(String name, Double amountperMonth, String details, Float taxpercent, String channelName) {
		super();
		this.name = name;
		this.amountperMonth = amountperMonth;
		this.details = details;
		this.taxpercent = taxpercent;
		this.channelName = channelName;
	}


	@Override
	public String toString() {
		return "PlanRespose [name=" + name + ", amountperMonth=" + amountperMonth + ", details=" + details
				+ ", taxpercent=" + taxpercent + ", channelName=" + channelName + "]";
	}
	

}