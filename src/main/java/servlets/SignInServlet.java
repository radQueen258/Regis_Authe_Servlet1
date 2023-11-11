package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/signIn.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("name");
        String password = request.getParameter("password");

        if (username.equals("radka") && password.equals("123456")){
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("authenticated", true);
            response.sendRedirect("/users");
        } else {
            response.sendRedirect("/signIn");
        }
    }
}
