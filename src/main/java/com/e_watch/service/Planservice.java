package com.e_watch.service;

import java.util.List;

import com.e_watch.dao.PlanModel;
import com.e_watch.dao.PlanRespose;

public interface Planservice  {
	
	public PlanRespose inert(PlanModel planModel);
	
	public List<PlanRespose> all();
	
	public PlanModel update (PlanModel planModel);

	String delete(Long id);
}
