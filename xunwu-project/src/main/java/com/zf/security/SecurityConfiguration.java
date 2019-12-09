package com.zf.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
     //   super.configure(http);
        http.authorizeRequests().anyRequest().fullyAuthenticated();
            http.formLogin().loginPage("/login").failureUrl("/login?code=").permitAll();
            http.logout().permitAll();
            http.authorizeRequests().antMatchers("/oauth/authorize").permitAll();
    }
}
