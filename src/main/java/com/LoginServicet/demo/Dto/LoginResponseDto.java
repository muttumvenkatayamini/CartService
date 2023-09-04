package com.LoginServicet.demo.Dto;

import lombok.Data;

@Data
public class LoginResponseDto {
	
	private Long userId;
	
	private String userName;
	
	private String sessionId;
	
	private String response;

}
