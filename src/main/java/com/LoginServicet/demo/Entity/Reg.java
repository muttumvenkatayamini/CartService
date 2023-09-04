package com.LoginServicet.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table
@Data
public class Reg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String userName;
	
	private String password;
	
	private String sessionId;
	
//	createdTime
//	
//	exipredTime
	

}
