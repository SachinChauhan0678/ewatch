package com.e_watch.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_watch.dao.ChannelModel;
import com.e_watch.dao.ChannelRespose;
import com.e_watch.entity.Channel;
import com.e_watch.entity.Promoter;
import com.e_watch.repo.AppUserRepo;
import com.e_watch.repo.ChannelRepo;
import com.e_watch.repo.PromoterRepo;
import com.e_watch.service.ChannelService;

@Service
public class ChannelImp implements ChannelService {
	@Autowired 
	ChannelRepo channelRepo;
	@Autowired 
	PromoterRepo promoterRepo;

	@Override
	public ChannelRespose insert(ChannelModel channelModel) {
		 Channel channel=new Channel(); 
		 channel.setName(channelModel.getName());
		 Promoter promoter = this.promoterRepo.findById(channelModel.getPromoterid()).get();
		 channel.setPromoter(promoter);
		 Channel save = this.channelRepo.save(channel);
		 ChannelRespose channelRespose=new ChannelRespose();
		 channelRespose.setId(save.getId());
		 channelRespose.setName(save.getName());
		 channelRespose.setPromoterName(promoter.getName());
		 return channelRespose;
	}

	@Override
	public List<ChannelRespose> all() {
		List<ChannelRespose> channelRespose=new ArrayList<>();
		List<Channel> findAll = this.channelRepo.findAll();
		findAll.forEach(data->{
			ChannelRespose channelRespose2=new ChannelRespose();
			channelRespose2.setId(data.getId());
			channelRespose2.setName(data.getName());
			channelRespose.add(channelRespose2);
			
		});
		return channelRespose;
	}
	@Override
	public ChannelModel update(ChannelModel channelModel) {
		 Channel channel=new Channel(); 
		 channel.setName(channelModel.getName());
		 Promoter promoter = this.promoterRepo.findById(channelModel.getPromoterid()).get();
		 Channel save = this.channelRepo.save(channel);
		 ChannelRespose channelRespose=new ChannelRespose();
		 channel.setPromoter(promoter);
		 channelRespose.setId(save.getId());
		 channelRespose.setName(save.getName());
		 channelRespose.setPromoterName(promoter.getName());
		return channelModel;
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		this.channelRepo.deleteById(id);
		return "data is delete";
		
	}

	

}
