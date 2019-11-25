package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.logDAO;
import model.loginPage;

/**
 * Servlet implementation class logingServ
 */
@WebServlet("/loginServ")
public class loginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 	HttpSession ha = request.getSession(false);
    //	System.out.println("enter="+ha.getAttribute("enter"));
    	if(ha != null){
    		ha.invalidate();
    	}
    	response.sendRedirect("login.html");
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ha = request.getSession();
		String login = request.getParameter("login");
		String password =request.getParameter("pwd");
		loginPage admin = new loginPage(login, password);
		logDAO admi = new logDAO();
		loginPage verif = admi.chekin(admin);
		if(verif.isValid())
		{
			ha.setAttribute("enter", verif);
			ha.setMaxInactiveInterval(1*30);
			

	    	response.sendRedirect("home.jsp");	


		}
		else
		{
			 response.sendRedirect("login.html");

		}


		
	}

}
