package com.Security.second.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.Filter;

@Configurable
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("yash").password("parikh").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
              //  .antMatchers("*/hello").hasRole("USER")
                .anyRequest().fullyAuthenticated()
                //.anyRequest().permitAll()
                .and()
                //.addFilterBefore(customFilter(), BasicAuthenticationFilter.class)
                .httpBasic()
                .and();
    }
    @Bean
    public CustomFilter customFilter() {
        return new CustomFilter();
    }
}
