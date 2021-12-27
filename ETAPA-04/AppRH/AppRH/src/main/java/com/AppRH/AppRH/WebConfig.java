package com.AppRH.AppRH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)throws Exception{
		
		builder
		.inMemoryAuthentication()
		.withUser("arthur").password("{noop}arthur").roles("USER")
		.and().withUser("root").password("{noop}root").roles("ADMIN");
		
	}
	
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/vagas**").permitAll()
		.antMatchers("/home**").permitAll().anyRequest()
		.authenticated().and().formLogin().permitAll()
		.and().logout().permitAll()
		.and().csrf().disable();
	}

	
}
