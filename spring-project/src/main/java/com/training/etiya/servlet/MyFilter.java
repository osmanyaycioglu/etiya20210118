package com.training.etiya.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/servtest")
public class MyFilter extends HttpFilter {

    /**
     *
     */
    private static final long serialVersionUID = -8024594055427668399L;

    @Override
    protected void doFilter(final HttpServletRequest requestParam,
                            final HttpServletResponse responseParam,
                            final FilterChain chainParam) throws IOException, ServletException {
        System.out.println("Filter çalıştı");
        chainParam.doFilter(requestParam,
                            responseParam);
    }
}
