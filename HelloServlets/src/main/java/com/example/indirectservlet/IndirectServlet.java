package com.example.indirectservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndirectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest rew, HttpServletResponse res)
        throws IOException, ServletException
    {
        System.out.println("In Indirect GET!");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException
    {
        System.out.println("In Indirect POST!");
    }
}
