package com.e_watch.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_watch.dao.PromoterRespose;
import com.e_watch.dao.Promotermodel;
import com.e_watch.entity.Promoter;
import com.e_watch.repo.PromoterRepo;
import com.e_watch.service.PromoterService;

@Service
public class PromoterImpl implements PromoterService {
	@Autowired
	PromoterRepo promoterRepo;

	@Override
	public PromoterRespose inert(Promotermodel promotermodel) {
		Promoter promoter2 = new Promoter();
		promoter2.setName(promotermodel.getName());
		Promoter save = this.promoterRepo.save(promoter2);
		PromoterRespose promoterRespose = new PromoterRespose();
		promoterRespose.setId(save.getId());
		promoterRespose.setName(save.getName());
		return promoterRespose;
	}

	@Override
	public List<PromoterRespose> all() {
		List<PromoterRespose> proResposes = new ArrayList<>();
		List<Promoter> findAll = this.promoterRepo.findAll();
		findAll.forEach(data -> {
			PromoterRespose promoterRespose = new PromoterRespose();
			promoterRespose.setId(data.getId());
			promoterRespose.setName(data.getName());
			proResposes.add(promoterRespose);
		});
		return proResposes;
	}

	@Override
	public String delete(long id) {
		this.promoterRepo.deleteById(id);
		return "data delete";
	}

	@Override
	public Promotermodel update(Promotermodel promotermodel) {
		Promoter promoter2 = new Promoter();
		promoter2.setId(promotermodel.getId());
		promoter2.setName(promotermodel.getName());
		Promoter save = this.promoterRepo.save(promoter2);
		PromoterRespose promoterRespose = new PromoterRespose();
		promoterRespose.setId(save.getId());
		promoterRespose.setName(save.getName());
		return promotermodel;

	}

}
