package simpleservlet.package1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int int1 = Integer.parseInt(req.getParameter("num1"));
//		int int2 = Integer.parseInt(req.getParameter("num2"));
//		
//		resp.getWriter().print("hi iam Servlet2 and "+int1+" and "+int2);
		
		
		
//		using URL-parameters(above)
		
//		using Request-Attribute
		
//		String str1=(String) req.getAttribute("Data1");
//		String str2=(String) req.getAttribute("Data2");
//		
//		resp.getWriter().print("hi iam Servlet2 and "+str1+str2);
		
		
//		using HTTPSession
//		HttpSession session=req.getSession();
//		String str1=(String) session.getAttribute("Data1");
//		String str2=(String) session.getAttribute("Data2");
//		resp.getWriter().print("hi iam Servlet2 and "+str1+str2);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		using HTTPSession
//		HttpSession session=req.getSession();
		String str1=(String) req.getAttribute("Data1");
		String str2=(String) req.getAttribute("Data2");
		resp.getWriter().print("hi iam Servlet2 and "+str1+str2);
	}
}
