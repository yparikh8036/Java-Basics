package com.Security.second.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

@Component
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("INTT::Called");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter::Called");
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;

        Principal principal = httpServletRequest.getUserPrincipal();
        System.out.println(principal);

    }

    @Override
    public void destroy() {
        System.out.println("destroy::Called");
    }
}
