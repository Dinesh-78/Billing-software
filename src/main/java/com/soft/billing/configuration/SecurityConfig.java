//package com.soft.billing.configuration;
//
//import org.apache.catalina.filters.HttpHeaderSecurityFilter; 
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//	
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
//		
//		HttpSecurity httpsecurity = http.sessionManagement(menagement -> menagement
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.authorizeHttpRequests(Authorize -> Authorize.requestMatchers("/api/**").authenticated().requestMatchers("/api/super-admin/**")
//						.hasRole("ADMIN").anyRequest().permitAll()
//						).addFilterBefore(new JwtValidator)
//				
//		return null;
//	}
//
//}
