package com.springproject.game.enterprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Data{
	
	public List<Integer> list()
	{
		return Arrays.asList(12,23,45,63);
	}
}