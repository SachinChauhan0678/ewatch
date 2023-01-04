package com.e_watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_watch.dao.PlanModel;
import com.e_watch.dao.PlanRespose;
import com.e_watch.service.Planservice;

@RestController
@RequestMapping("/plan")
public class PlanController {
	@Autowired
	Planservice planservice;

	@PostMapping("/")
	public PlanRespose inert(@RequestBody PlanModel planModel) {
		PlanRespose inert = this.planservice.inert(planModel);
		return inert;
	}

	@GetMapping("/")
	public List<PlanRespose> all() {
		List<PlanRespose> all = this.planservice.all();
		return all;
	}

	@PutMapping
	public PlanModel update(PlanModel planModel) {
		PlanModel update = this.planservice.update(planModel);
		return update;
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		String delete = this.planservice.delete(id);
		return delete;
	}
}
