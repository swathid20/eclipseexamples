package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("un");
		String pwd=request.getParameter("pw");
		PrintWriter p=response.getWriter();
		if((user.equals("Admin"))&&(pwd.equals("cts")))
		{
			RequestDispatcher rd=request.getRequestDispatcher("success.html");
			p.print("<html><body>forwarding content</body></html?");
			rd.forward(request,response);
			//p.print("<html><body><p>Successful login</p></body></html>");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			p.print("Authentication failed");
			rd.include(request, response);
		//p.print("<html><body><p>Authentication failed</p></body></html>");	
		}
	}

}
