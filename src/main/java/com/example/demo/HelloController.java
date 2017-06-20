package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/Leslie")
	public String Hello(){
		return "Hello Leslie";

	}

	@GetMapping("/Killian")
	public String Hello2(){
		return "Hello Killian";

	}
	
	@GetMapping("/Monika")
	public String Hello3(){
		return "Hello Monika";

	}

 
}





