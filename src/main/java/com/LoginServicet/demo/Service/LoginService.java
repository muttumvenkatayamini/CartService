package com.LoginServicet.demo.Service;

import com.LoginServicet.demo.Dto.LoginResponseDto;

public interface LoginService {

	LoginResponseDto ValidateUser(String username, String password);

}
