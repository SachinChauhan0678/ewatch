package com.e_watch.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_watch.dao.ChannelModel;
import com.e_watch.dao.PlanModel;
import com.e_watch.dao.PlanRespose;
import com.e_watch.entity.Channel;
import com.e_watch.entity.Plan;
import com.e_watch.entity.Promoter;
import com.e_watch.repo.ChannelRepo;
import com.e_watch.repo.PlanRepo;
import com.e_watch.service.Planservice;
@Service
public class PlanImp implements Planservice {
	
	@Autowired 
	PlanRepo planRepo;
	@Autowired
	ChannelRepo channelRepo;	
	@Override
	public PlanRespose inert(PlanModel planModel) {
		Plan plan =new Plan();
		plan.setName(planModel.getName());
		System.err.println(planModel.getName());
		plan.setAmountperMonth(planModel.getAmountperMonth());
		plan.setDetails(planModel.getDetails());
		plan.setTaxpercent(planModel.getTaxpercent());
//		System.out.println(planModel.getChannelid());
		Channel chennel = this.channelRepo.findById(planModel.getChannelid()).get();
		plan.setChannel(chennel);
		Plan save = this.planRepo.save(plan);
		PlanRespose planRespose=new PlanRespose();
		planRespose.setName(save.getName());
//		planRespose.setId(save.getId(0));
		planRespose.setAmountperMonth(save.getAmountperMonth());
		planRespose.setDetails(save.getDetails());
//		planRespose.setPromoterName(null);
		planRespose.setTaxpercent(save.getTaxpercent());
		planRespose.setChannelName(save.getName());
		
		return planRespose;
	}

	@Override
	public List<PlanRespose> all() {
		List<PlanRespose> plan2=new ArrayList<>();
		List<Plan> findAll = this.planRepo.findAll();
		findAll.forEach(data->{
			PlanRespose planRespose =new PlanRespose();
//			planRespose.setId(data.getId());
			planRespose.setAmountperMonth(data.getAmountperMonth());
			planRespose.setName(data.getName());
			planRespose.setTaxpercent(data.getTaxpercent());
			plan2.add(planRespose);
		});
		
		
		return plan2;
	}


	@Override
	public PlanModel update(PlanModel planModel) {
		Plan plan =new Plan();
		plan.setName(planModel.getName());
		plan.getId(planModel.getId());
		plan.setAmountperMonth(planModel.getAmountperMonth());
		plan.setDetails(plan.getDetails());
		plan.setTaxpercent(plan.getTaxpercent());
//		System.out.println(planModel.getChannelid());
		Channel chennel = this.channelRepo.findById(planModel.getChannelid()).get();
		plan.setChannel(chennel);
		Plan save = this.planRepo.save(plan);
		PlanRespose planRespose=new PlanRespose();
		planRespose.setAmountperMonth(save.getAmountperMonth());
		planRespose.setDetails(save.getDetails());
		planRespose.setTaxpercent(save.getTaxpercent());
		planRespose.setChannelName(save.getName());
		
		//return planRespose;
		return planModel;
	}

	

	@Override
	public String delete(Long id) {
		this.planRepo.deleteById( id);
		return "data is delete";
	}

	
}
