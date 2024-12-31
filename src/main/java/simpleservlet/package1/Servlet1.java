package simpleservlet.package1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Servlet1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Parse input parameters
//		int int1 = Integer.parseInt(req.getParameter("num1"));
//		int int2 = Integer.parseInt(req.getParameter("num2"));
		String int1 = req.getParameter("num1"); // for servlet2 purpose only
		String int2 = req.getParameter("num2"); // for servlet2 purpose only

//		String btn = req.getParameter("btn");
//	
//		int ans;
//
//		if (btn.equals("1")) {
//			ans = int1 + int2;
//		}
//		else if (btn.equals("2")) {
//			ans = int1 - int2;
//		} else if (btn.equals("3")) {
//			ans = int1 / int2;
//		} else {
//			ans = int1 * int2;
//		}
//
//		resp.getWriter().print("Ans is: " + ans);
//		resp.sendRedirect("result.jsp?ans="+ans);
		
		
//		for servlet2
//		resp.sendRedirect("Servlet2");
//		RequestDispatcher rd=req.getRequestDispatcher("Servlet2");
//		rd.forward(req, resp);
		
		
//		using URL-parameters(above)
		
		
//		using Request-Attribute
		
//		req.setAttribute("Data1", int1);
//		req.setAttribute("Data2", int2);
////		resp.sendRedirect("Servlet2"); it wont carry values use rd
//		req.getRequestDispatcher("Servlet2").forward(req, resp);
		
		
//		using HTTPSession
//		HttpSession session=req.getSession();
		req.setAttribute("Data1", int1);
		req.setAttribute("Data2", int2);
		req.getRequestDispatcher("Servlet2").forward(req, resp);
		
		
	}
}
