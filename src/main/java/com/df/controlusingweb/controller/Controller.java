package com.df.controlusingweb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@RequestMapping(value = "/account",method =RequestMethod.GET)
	public String account()
	{
		return "dummy accounts  created";
	}

	
}


