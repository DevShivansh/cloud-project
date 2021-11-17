package com.clouldproject.cloudproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.clouldproject.dto.LoginDto;

@Controller
public class LoginController {

	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDto request){
		System.out.println(request);
		return ResponseEntity.ok().body("Success");
	}
}
