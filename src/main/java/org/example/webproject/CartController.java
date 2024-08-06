package org.example.webproject;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.example.webproject.common.StringUtil;

import java.io.IOException;

@WebServlet(value = "/cart")
@Log4j2
public class CartController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mnostr = req.getParameter("mno");

        Integer mno = StringUtil.getInt(mnostr,-1);






    }
}
