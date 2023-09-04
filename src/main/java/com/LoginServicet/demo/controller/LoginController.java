 package com.LoginServicet.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LoginServicet.demo.Dto.LoginResponseDto;
import com.LoginServicet.demo.Service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class LoginController {
	@Autowired
	public LoginService loginService;
	
	
//	@PostMapping("/signIn")
//	public ResponseEntity<String> signIn(@RequestBody LoginDto loginDto){
//		String response =loginService.ValidateUser(loginDto.getUserName(),loginDto.getPassword());
//		return ResponseEntity.ok(response);
//		
//	}
	@PostMapping("/signIn")
	public ResponseEntity<LoginResponseDto> signIn(@RequestParam String userName, @RequestParam String password) {
//		LoginResponseDto user = loginService.ValidateUser(userName, password);
		return ResponseEntity.ok(loginService.ValidateUser(userName, password));

	}

}
