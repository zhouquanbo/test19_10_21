package bo.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

@javax.servlet.annotation.WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println(name);
        System.out.println("afasfssa");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
 