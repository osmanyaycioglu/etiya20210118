package com.training.etiya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servtest")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 6667142529804972399L;

    @Override
    protected void doGet(final HttpServletRequest reqParam,
                         final HttpServletResponse respParam) throws ServletException, IOException {

        respParam.getWriter()
                 .print("Hello from servlet");
    }

}
