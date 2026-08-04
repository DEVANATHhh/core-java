package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(loadOnStartup = 1, urlPatterns = "/vehicle")
public class VehicleRegistrationServlet extends HttpServlet {

    public VehicleRegistrationServlet() {
        System.out.println("VehicleRegistrationServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String vehicleNo = req.getParameter("vehicleNo");
        String ownerName = req.getParameter("ownerName");
        String vehicleType = req.getParameter("vehicleType");
        String regDate = req.getParameter("regDate");
        String insurance = req.getParameter("insuranceDate");
        String fuel = req.getParameter("fuel");

        System.out.println(vehicleNo);
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(regDate);
        System.out.println(insurance);
        System.out.println(fuel);

        if (!vehicleNo.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$")) {

            resp.getWriter().println("<h2>Invalid Vehicle Number</h2>");
            return;

        }

        LocalDate insuranceDate = LocalDate.parse(insurance);

        if (!insuranceDate.isAfter(LocalDate.now())) {

            resp.getWriter().println("<h2>Insurance should be a future date</h2>");
            return;

        }

        if (!(fuel.equals("Petrol")
                || fuel.equals("Diesel")
                || fuel.equals("Electric")
                || fuel.equals("CNG"))) {

            resp.getWriter().println("<h2>Invalid Fuel Type</h2>");
            return;

        }

        double amount = 0;

        switch (vehicleType) {

            case "Bike":
                amount = 500;
                break;

            case "Car":
                amount = 1200;
                break;

            case "Truck":
                amount = 2500;
                break;

            case "Bus":
                amount = 3000;
                break;

            default:
                amount = 1000;
        }

        req.setAttribute("guestName", ownerName);
        req.setAttribute("roomType", vehicleType);
        req.setAttribute("guestNo", vehicleNo);
        req.setAttribute("checkIn", regDate);
        req.setAttribute("checkOut", insurance);
        req.setAttribute("amount", amount);

        req.getRequestDispatcher("payment.jsp")
                .forward(req, resp);

    }
}