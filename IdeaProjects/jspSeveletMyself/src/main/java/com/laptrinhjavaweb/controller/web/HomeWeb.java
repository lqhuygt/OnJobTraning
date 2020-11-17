package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.INewCategoryService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeWeb extends HttpServlet {
    @Inject
    private INewCategoryService   categoryService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("category", categoryService.findAll());
        req.getRequestDispatcher("/views/web/home.jsp").forward(req,resp);
    }
}
