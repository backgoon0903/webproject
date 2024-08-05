package org.example.webproject;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;

@WebServlet(value = "/goods ")
@Log4j2
public class GoodsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("/WEB-INF/goods.jsp").forward(req, resp);
        }catch(Exception e) {
            e.printStackTrace();//debug
        }
    }
}
