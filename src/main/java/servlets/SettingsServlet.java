package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/settings")

public class SettingsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] colooor = (request.getCookies());
        System.out.println(colooor[0].getValue() + " " + colooor[0].getName());
        System.out.println(colooor[1].getValue() + " " + colooor[1].getName());
        System.out.println("********************************************");
        request.getRequestDispatcher("/jsp/settings.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        Cookie colorCookie = new Cookie("color", color);
        response.sendRedirect("/settings");
    }
}
