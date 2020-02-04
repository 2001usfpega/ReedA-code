package com.example.directservlet;

import com.example.model.SuperVillain;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * HTTP methods include: get, post, put, delete, pathc, head, options,
 * trace, connect, etc
 */
@SuppressWarnings("serial")
public class DirectServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        System.out.println("Indirect doGet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body><h1>The servlet is directly talking to the " + " client! <h1><body><html>"); //making a connecion to client w/ printwriter
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        System.out.println("Indirect doPost");
        //sending an entire object to the front end
        res.setContentType("application/json");
        SuperVillain arura = new SuperVillain("Asura", "Hair Armament", 200_000);
    }
}