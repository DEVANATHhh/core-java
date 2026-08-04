package com.Xworkz.Task.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 4, urlPatterns = "/recipe")
public class RecipeManagementServlet extends HttpServlet {

    public RecipeManagementServlet() {
        System.out.println("RecipeManagementServlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        String recipeName = req.getParameter("recipeName");
        String cuisineType = req.getParameter("cuisineType");
        String cookingTime = req.getParameter("cookingTime");
        String difficulty = req.getParameter("difficulty");
        String ingredients = req.getParameter("ingredients");
        String calories = req.getParameter("calories");

        System.out.println("Recipe Name : " + recipeName);
        System.out.println("Cuisine Type : " + cuisineType);
        System.out.println("Cooking Time : " + cookingTime);
        System.out.println("Difficulty : " + difficulty);
        System.out.println("Ingredients : " + ingredients);
        System.out.println("Calories : " + calories);

        int cookTime = Integer.parseInt(cookingTime);

        if (cookTime <= 0) {
            resp.getWriter().println("<h2>Cooking Time must be greater than zero.</h2>");
            return;
        }

        if (!(difficulty.equals("Easy")
                || difficulty.equals("Medium")
                || difficulty.equals("Hard"))) {

            resp.getWriter().println("<h2>Invalid Difficulty Level.</h2>");
            return;
        }

        int ingredientCount = Integer.parseInt(ingredients);

        if (ingredientCount <= 0) {
            resp.getWriter().println("<h2>Ingredients Count must be greater than zero.</h2>");
            return;
        }

        int calorieCount = Integer.parseInt(calories);

        if (calorieCount < 50 || calorieCount > 2000) {
            resp.getWriter().println("<h2>Calories must be between 50 and 2000.</h2>");
            return;
        }

        double amount = ingredientCount * 10;

        req.setAttribute("guestName", recipeName);
        req.setAttribute("roomType", cuisineType);
        req.setAttribute("guestNo", String.valueOf(ingredientCount));
        req.setAttribute("checkIn", difficulty);
        req.setAttribute("checkOut", cookingTime + " Minutes");
        req.setAttribute("amount", amount);

        req.getRequestDispatcher("payment.jsp")
                .forward(req, resp);
    }
}