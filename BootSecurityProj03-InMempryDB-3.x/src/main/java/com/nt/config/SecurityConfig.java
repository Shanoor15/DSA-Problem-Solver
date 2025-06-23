package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity//It enables Spring Security at the web layer
@EnableMethodSecurity//It enables security at the method level.
public class SecurityConfig {

	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.csrf((csrf)->csrf.disable())
			.authorizeHttpRequests((requests)->requests
					.requestMatchers("/bank/welcome").permitAll()
					.requestMatchers("/bank/balance","/bank/loan_approve","/bank/offers").authenticated())
					.formLogin(Customizer.withDefaults());
			
			return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails user1=User.withUsername("raja")
		.password(encoder().encode("rani"))
		.authorities("CUSTOMER")
		.build();
		UserDetails user2=User.withUsername("mahesh")
				.password(encoder().encode("hyd"))
				.authorities("MANAGER","CUSTOMER")
				.build();
		return new InMemoryUserDetailsManager(user1,user2);
	}
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
