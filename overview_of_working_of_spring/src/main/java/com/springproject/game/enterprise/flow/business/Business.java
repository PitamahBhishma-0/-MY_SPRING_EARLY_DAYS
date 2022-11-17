package com.springproject.game.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.game.enterprise.flow.data.Data;

@Component
public class Business{
	@Autowired
	Data data;
	public long sum() {
		List<Integer> dataservice=data.list();
		return dataservice.stream().reduce(Integer::sum).get();
	}
}