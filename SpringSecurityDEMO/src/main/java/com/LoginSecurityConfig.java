package com;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// authentication
		auth.inMemoryAuthentication().withUser("Hcl").password("Hcl").roles("USER");
		//auth.inMemoryAuthentication().withUser("Hcl1").password("Hcl1").roles("ADMIN");
	}

	public void configure(HttpSecurity http) throws Exception {
		// authorization
		http.authorizeRequests().antMatchers("/Success").access("hasRole('ROLE_USER')")
	/*http.authorizeRequests().antMatchers("/Admin").hasRole("ROLE_ADMIN")*/.and().formLogin().loginPage("/loginPage")
				.defaultSuccessUrl("/Success").failureUrl("/loginPage?error").and().logout().logoutSuccessUrl("/loginPage?logout");

	}
}
