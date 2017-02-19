package pl.javastart.servlets;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class WybierzPiwo extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException , ServletException {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	out.println("Porada piwna<br>");
    	String c = request.getParameter("kolor");
    	out.println("<br>Wybrany kolor piwa : " + c);
    }
}