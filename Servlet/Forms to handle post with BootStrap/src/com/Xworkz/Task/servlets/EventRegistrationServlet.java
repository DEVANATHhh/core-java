package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 2, urlPatterns = "/event")
public class EventRegistrationServlet extends HttpServlet {

    public EventRegistrationServlet() {
        System.out.println("EventRegistrationServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String eventName = req.getParameter("eventName");
        String organizerName = req.getParameter("organizerName");
        String eventDate = req.getParameter("eventDate");
        String venue = req.getParameter("venue");
        String capacity = req.getParameter("capacity");
        String fee = req.getParameter("fee");

        System.out.println("Event Name : " + eventName);
        System.out.println("Organizer : " + organizerName);
        System.out.println("Event Date : " + eventDate);
        System.out.println("Venue : " + venue);
        System.out.println("Capacity : " + capacity);
        System.out.println("Fee : " + fee);

        LocalDate date = LocalDate.parse(eventDate);

        if (!date.isAfter(LocalDate.now())) {
            resp.getWriter().println("<h2>Event Date must be a future date.</h2>");
            return;
        }

        int totalCapacity = Integer.parseInt(capacity);

        if (totalCapacity <= 0) {
            resp.getWriter().println("<h2>Capacity should be greater than zero.</h2>");
            return;
        }

        double registrationFee = Double.parseDouble(fee);

        if (registrationFee <= 0) {
            resp.getWriter().println("<h2>Registration Fee should be greater than zero.</h2>");
            return;
        }

        req.setAttribute("guestName", organizerName);
        req.setAttribute("roomType", eventName);
        req.setAttribute("guestNo", capacity);
        req.setAttribute("checkIn", eventDate);
        req.setAttribute("checkOut", venue);
        req.setAttribute("amount", registrationFee);

        req.getRequestDispatcher("payment.jsp")
                .forward(req, resp);
    }
}