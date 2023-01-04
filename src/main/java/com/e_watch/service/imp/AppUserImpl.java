package com.e_watch.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_watch.dao.AppUserModel;
import com.e_watch.dao.AppUserRespose;
import com.e_watch.entity.AppUser;
import com.e_watch.repo.AppUserRepo;
import com.e_watch.service.AppUserService;
@Service
public class AppUserImpl implements AppUserService {
	@Autowired
	AppUserRepo appUserRepo;

	@Override
	public AppUserRespose inert(AppUserModel appUserModel) {
		AppUser appUser = new AppUser();
		appUser.setUserName(appUserModel.getUserName());
		appUser.setMobileNumber(appUserModel.getMobileNumber());
		appUser.setRole(appUserModel.getRole());
		AppUser save = this.appUserRepo.save(appUser);
		AppUserRespose appUser2 = new AppUserRespose();
		appUser2.setUserName(save.getUserName());
		appUser2.setMobileNumber(save.getMobileNumber());
//		appUser2.getRole(save.getRole());
		appUser2.setId(save.getId());
		return appUser2;
	}

	@Override
	public List<AppUserRespose> all() {
		List<AppUser> findAll = this.appUserRepo.findAll();
		List<AppUserRespose> appUser = new ArrayList<>();
		findAll.forEach(data -> {
			AppUserRespose appUserRespose = new AppUserRespose();
			appUserRespose.setId(data.getId());
			appUserRespose.setUserName(data.getUserName());
			appUser.add(appUserRespose);
		});
		return appUser;
	}

	@Override
	public String delete(int id) {
		this.appUserRepo.deleteById(id);
		return "data is delete";
	}

	@Override
	public AppUserModel update(AppUserModel appUserModel) {
		AppUser appUser = new AppUser();
		appUser.setUserName(appUserModel.getUserName());
		appUser.setMobileNumber(appUserModel.getMobileNumber());
		appUser.setRole(appUserModel.getRole());
		AppUser save = this.appUserRepo.save(appUser);
		AppUserRespose appUser2 = new AppUserRespose();
		appUser2.setUserName(save.getUserName());
		appUser2.setId(save.getId());
		appUser2.getMobileNumber();
		return appUserModel;
		
	}

}
