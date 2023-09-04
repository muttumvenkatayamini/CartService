package com.LoginServicet.demo.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String userName;
	
	private String password;
	
	

}
