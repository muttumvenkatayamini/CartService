package com.LoginServicet.demo.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginServicet.demo.Dto.LoginResponseDto;
import com.LoginServicet.demo.Entity.LoginEntity;
import com.LoginServicet.demo.Entity.Reg;
import com.LoginServicet.demo.Repository.LoginRepository;
import com.LoginServicet.demo.Repository.RegRepository;

@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	public LoginRepository loginRepo;
	@Autowired
	private RegRepository regRepo;

	@Override
	public LoginResponseDto ValidateUser(String username, String password) {
		Reg registration = new Reg();
		LoginEntity login = loginRepo.findByUserName(username);
		LoginResponseDto  loginR = new LoginResponseDto();
		if(login==null) {
			loginR.setUserName(registration.getUserName());
			loginR.setResponse("user not found");
			return loginR;
		}else if(!password.matches(login.getPassword())) {
			loginR.setUserName(registration.getUserName());
			loginR.setResponse("Please Check password once");
			return loginR;
			
		}else {
			String sessionId = UUID.randomUUID().toString();
			registration.setPassword(password);
			registration.setUserName(username);
			registration.setSessionId(sessionId);
			regRepo.save(registration);
			loginR.setUserId(registration.getUserId());
			loginR.setUserName(registration.getUserName());
			loginR.setSessionId(registration.getSessionId());
			loginR.setResponse("Succefully Login");
			return loginR;
		}
		
	}

}
