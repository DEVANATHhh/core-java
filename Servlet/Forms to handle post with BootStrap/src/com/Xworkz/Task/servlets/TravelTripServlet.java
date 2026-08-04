package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 5, urlPatterns = "/travel")
public class TravelTripServlet extends HttpServlet {

    public TravelTripServlet() {
        System.out.println("TravelTripServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String destination = req.getParameter("destination");
        String travelDate = req.getParameter("travelDate");
        String returnDate = req.getParameter("returnDate");
        String travellers = req.getParameter("travellers");
        String budget = req.getParameter("budget");
        String transport = req.getParameter("transport");

        System.out.println("Destination : " + destination);
        System.out.println("Travel Date : " + travelDate);
        System.out.println("Return Date : " + returnDate);
        System.out.println("Travellers : " + travellers);
        System.out.println("Budget : " + budget);
        System.out.println("Transport : " + transport);

        LocalDate startDate = LocalDate.parse(travelDate);
        LocalDate endDate = LocalDate.parse(returnDate);

        // Return date validation
        if (!endDate.isAfter(startDate)) {
            resp.getWriter().println("<h2>Return Date must be after Travel Date.</h2>");
            return;
        }

        // Traveller validation
        int travellerCount = Integer.parseInt(travellers);

        if (travellerCount <= 0) {
            resp.getWriter().println("<h2>Traveller count must be greater than zero.</h2>");
            return;
        }

        // Budget validation
        double totalBudget = Double.parseDouble(budget);

        if (totalBudget <= 0) {
            resp.getWriter().println("<h2>Budget must be greater than zero.</h2>");
            return;
        }

        // Transport validation
        if (!(transport.equals("Bus")
                || transport.equals("Train")
                || transport.equals("Flight")
                || transport.equals("Car"))) {

            resp.getWriter().println("<h2>Select a valid Transport Mode.</h2>");
            return;
        }

        double amount = totalBudget * 0.10;

        req.setAttribute("guestName", destination);
        req.setAttribute("roomType", transport);
        req.setAttribute("guestNo", travellers);
        req.setAttribute("checkIn", travelDate);
        req.setAttribute("checkOut", returnDate);
        req.setAttribute("amount", amount);

        req.getRequestDispatcher("payment.jsp")
                .forward(req, resp);
    }
}