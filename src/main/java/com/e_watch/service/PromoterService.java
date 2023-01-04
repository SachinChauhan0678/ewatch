package com.e_watch.service;

import java.util.List;

import com.e_watch.dao.PromoterRespose;
import com.e_watch.dao.Promotermodel;

public interface PromoterService {

 public	PromoterRespose inert(Promotermodel promotermodel);
 
 public List<PromoterRespose> all();
 
 public String delete(long id);
 
 public Promotermodel update (Promotermodel promotermodel);
}
