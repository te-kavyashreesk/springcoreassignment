package com.te.spring;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class School 
{

	public School()
	{
		
	}
	
	private int id;
	private String name;
}
