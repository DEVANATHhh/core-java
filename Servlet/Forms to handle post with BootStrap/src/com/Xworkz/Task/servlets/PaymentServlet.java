package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(loadOnStartup = 10, urlPatterns = "/payment")
public class PaymentServlet extends HttpServlet {

    public PaymentServlet() {
        System.out.println("PaymentServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Payment Successful");

        req.getRequestDispatcher("processing.jsp")
                .forward(req, resp);
    }
}