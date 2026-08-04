package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 3, urlPatterns = "/hotel")
public class HotelBookingServlet extends HttpServlet {

    public HotelBookingServlet() {
        System.out.println("HotelBookingServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String guestName = req.getParameter("guestName");
        String checkIn = req.getParameter("checkIn");
        String checkOut = req.getParameter("checkOut");
        String roomType = req.getParameter("roomType");
        String guests = req.getParameter("guests");
        String amount = req.getParameter("amount");

        System.out.println("Guest Name : " + guestName);
        System.out.println("Check-In : " + checkIn);
        System.out.println("Check-Out : " + checkOut);
        System.out.println("Room Type : " + roomType);
        System.out.println("Guests : " + guests);
        System.out.println("Amount : " + amount);

        LocalDate inDate = LocalDate.parse(checkIn);
        LocalDate outDate = LocalDate.parse(checkOut);

        if (!outDate.isAfter(inDate)) {
            resp.getWriter().println("<h2>Check-Out Date must be after Check-In Date.</h2>");
            return;
        }

        int guestCount = Integer.parseInt(guests);

        switch (roomType) {

            case "Single":
                if (guestCount > 1) {
                    resp.getWriter().println("<h2>Single Room allows only 1 guest.</h2>");
                    return;
                }
                break;

            case "Double":
                if (guestCount > 2) {
                    resp.getWriter().println("<h2>Double Room allows only 2 guests.</h2>");
                    return;
                }
                break;

            case "Family":
                if (guestCount > 5) {
                    resp.getWriter().println("<h2>Family Room allows maximum 5 guests.</h2>");
                    return;
                }
                break;

            default:
                resp.getWriter().println("<h2>Select a valid Room Type.</h2>");
                return;
        }

        double totalAmount = Double.parseDouble(amount);

        if (totalAmount <= 0) {
            resp.getWriter().println("<h2>Amount must be greater than zero.</h2>");
            return;
        }

        req.setAttribute("guestName", guestName);
        req.setAttribute("roomType", roomType);
        req.setAttribute("guestNo", guests);
        req.setAttribute("checkIn", checkIn);
        req.setAttribute("checkOut", checkOut);
        req.setAttribute("amount", totalAmount);

        req.getRequestDispatcher("payment.jsp")
                .forward(req, resp);
    }
}