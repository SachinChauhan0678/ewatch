package com.e_watch.service;

import java.util.List;

import com.e_watch.dao.AppUserModel;
import com.e_watch.dao.AppUserRespose;

public interface AppUserService {

	public AppUserRespose inert(AppUserModel appUserModel);

	public List<AppUserRespose> all();

	public String delete(int id);
	
	public AppUserModel update (AppUserModel appUserModel);

	
}
