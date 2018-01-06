/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.corebanking.controller;

import com.prakas.corebanking.dao.AccountDAO;
import com.prakas.corebanking.dao.impl.AccounDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prakas
 */
@WebServlet(name = "account",urlPatterns ={"/account/*","/admin/account/*"})
public class AccountController extends HttpServlet{
    private AccountDAO accountDAO=new AccounDAOImpl();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setAttribute("accounts", accountDAO.getAll());
        RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/account/index.jsp");
        dispatcher.forward(request, response);
    }  
}
