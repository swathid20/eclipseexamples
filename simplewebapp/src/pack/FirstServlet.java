package pack;

//import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private int i=0;
    private int j=0;
    public FirstServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		i++;
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	j++;
		PrintWriter pw=response.getWriter();
		System.out.println("doget() method");
		pw.print("<html><body>");
		pw.print("<p>Value of i="+i+",Value of j:"+j+"</p></body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	j++;
	PrintWriter pw=response.getWriter();
	System.out.println("dopost()");
	pw.print("<html><body");
	pw.print("<p>Value of i"+i+"Value of j"+j+"</p></body></html>");
	}

}
