package org.springboot.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/xs/myservlet", description="Servlet的描述说明") // 不指定name的情况下，name默认值为类全路径，即org.springboot.sample.servlet.MyServlet
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 5557229560671830053L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
		doPost(req, resp);
	}
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        HttpSession session = req.getSession();
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
        out.println("<html>");  
        out.println("<head>");  
        out.println("<title>Hello World</title>");  
        out.println("</head>");  
        out.println("<body>");  
        out.println("<h1>大家好，我的名字叫Servlet</h1>");  
        out.println("</body>");  
        out.println("</html>"); 
    }
	
}
