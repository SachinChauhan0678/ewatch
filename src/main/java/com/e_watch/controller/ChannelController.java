package com.e_watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_watch.dao.ChannelModel;
import com.e_watch.dao.ChannelRespose;
import com.e_watch.service.ChannelService;
@RestController
@RequestMapping("/channel")
public class ChannelController {
	
	@Autowired
	ChannelService channelService;
	
	@PostMapping("/")
	public ChannelRespose insert(@RequestBody ChannelModel channelModel) {
		ChannelRespose insert = this.channelService.insert(channelModel);
		return insert;
	}
	@GetMapping("/")
	public List<ChannelRespose> all(){
		List<ChannelRespose> all = this.channelService.all();
		return all;
	}
	@DeleteMapping("/delete/{id}")
	public String delete (@RequestBody Long id) {
		String delete = this.channelService.delete(id);
		return delete;
	}
	@PutMapping("/")
	public ChannelModel update (@RequestBody ChannelModel channelModel) {
		ChannelModel update = this.channelService.update(channelModel);
		return update;
	}

}
