package com.e_watch.service;

import java.util.List;

import com.e_watch.dao.ChannelModel;
import com.e_watch.dao.ChannelRespose;

public interface ChannelService {
	
	public ChannelRespose insert(ChannelModel channelModel);
	
	public List<ChannelRespose> all();
	
	public String delete (Long id);
	
	public ChannelModel update (ChannelModel channelModel);



}
