package br.com.imobiliaria.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello Word!";
	}

}
