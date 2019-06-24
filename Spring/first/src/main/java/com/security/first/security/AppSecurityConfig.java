package com.security.first.security;

import com.security.first.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configurable
@EnableWebSecurity
//@EnableOAuth2Client
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private MyUserDetailService userDetailsService;
//
//    @Bean
//    public AuthenticationProvider authProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
//        // provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        provider.setPasswordEncoder(new BCryptPasswordEncoder());
//        return provider;
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        System.out.println("nlknvslnvdslknvslkvns");
////        http
////                .csrf().disable()
////                .authorizeRequests().antMatchers("/login").permitAll()
////                .and()
////                .formLogin()
////                .loginPage("/login").permitAll()
////                .and()
////                .logout().invalidateHttpSession(true)
////                .clearAuthentication(true)
////                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
////                .logoutSuccessUrl("/home");
//
//        http
//                .csrf().disable()
//                .authorizeRequests().antMatchers("/login").permitAll()
//                .anyRequest().authenticated();
 //   }

    //    @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        List<UserDetails> userDetailsList = new ArrayList<>();
//        userDetailsList.add(User.withDefaultPasswordEncoder().username("yash").password("1234").roles("USER").build());
//
//        return new InMemoryUserDetailsManager(userDetailsList);
//    }

}
