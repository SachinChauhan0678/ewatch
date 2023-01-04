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

import com.e_watch.dao.AppUserModel;
import com.e_watch.dao.AppUserRespose;
import com.e_watch.service.AppUserService;
@RestController
@RequestMapping("/watch")
public class AppUserController {
	
	@Autowired 
	AppUserService appUserService;
	@PostMapping("/")
	public AppUserRespose inert(@RequestBody AppUserModel appUserModel) {
		AppUserRespose inert = this.appUserService.inert(appUserModel);
		return inert;
	}
	@GetMapping("/")
	public List<AppUserRespose> all(){
		List<AppUserRespose> all = this.appUserService.all();
		return all;
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		String delete = this.appUserService.delete(id);
		return delete ;
	}
	@PutMapping()
	public AppUserModel update (@RequestBody AppUserModel appUserModel) {
		AppUserModel update = this.appUserService.update(appUserModel);
		return update;
	}
}
