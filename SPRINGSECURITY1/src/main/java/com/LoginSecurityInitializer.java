package com;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class LoginSecurityInitializer extends  AbstractSecurityWebApplicationInitializer{

	public LoginSecurityInitializer() {
		super(LoginSecurityConfig.class);
		
	}

	
	

}
