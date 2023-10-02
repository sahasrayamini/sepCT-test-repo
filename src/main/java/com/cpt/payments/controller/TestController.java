package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {
	
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "helllo world!";
	}
	
	@GetMapping("/addGET")
	public int addGet(@RequestParam(value="num1")int val1,
			@RequestParam(value="num2") int val2) {
		System.out.println("calling GET Add method val1"+val1+"|val2:"+val2);
		
		int res=val1+val2;
		System.out.println("add res:"+res);
		
				return res;
		
	
	
	
	
	
	
//	public String initPayment(String PaymentMethod,int amount,String curl) {
//		
//		return "Payment process sucessfull";
//		
	}
	
	@PostMapping("/addPOST")
	public int addPOST(@RequestParam(value="num1")int val1,
			@RequestParam(value="num2") int val2) {
		System.out.println("calling POST Add method val1"+val1+"|val2:"+val2);
		
		int res=val1+val2;
		System.out.println("add res:"+res);
		
				return res;
		
	}
	@GetMapping("/get")
	public String GetWorld() {
		return "getworld";
	}


}

