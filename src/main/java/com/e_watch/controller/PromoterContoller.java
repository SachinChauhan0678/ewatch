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

import com.e_watch.dao.PromoterRespose;
import com.e_watch.dao.Promotermodel;
import com.e_watch.service.PromoterService;

@RestController
@RequestMapping("/promoter")
public class PromoterContoller {

	@Autowired
	PromoterService promoterService;

		@PostMapping("/")
		public PromoterRespose inert(@RequestBody Promotermodel promotermodel) {
		PromoterRespose inert = this.promoterService.inert(promotermodel);
		return inert;
		}
		@GetMapping("/")
		public List<PromoterRespose> all() {
		List<PromoterRespose> all = this.promoterService.all();
		return all;
		}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable("id") int id) {
		String delete = this.promoterService.delete(id);
		return delete;
		}
		@PutMapping("/")
		public Promotermodel update(@RequestBody Promotermodel promotermodel) {
		Promotermodel update = this.promoterService.update(promotermodel);
		return update;
		}
}
