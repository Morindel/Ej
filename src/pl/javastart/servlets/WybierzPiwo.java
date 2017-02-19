package pl.javastart.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.EkspertPiwny;
 
public class WybierzPiwo extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException , ServletException {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	out.println("Porada piwna<br>");
    	String c = request.getParameter("kolor");
    	out.println("<br>Wybrany kolor piwa : " + c);
    	
    	EkspertPiwny p1=new EkspertPiwny();
    	List wynik = p1.getMarki("kolor");
    	
    	Iterator it = wynik.iterator();
    	while(it.hasNext())
    	{
    		out.println("<br >Sprobój : "  + it.next() );
    	}
    	//out.print("Piwa ktore polubisz to" + p1.getMarki("kolor"));
    }
}