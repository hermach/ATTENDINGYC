package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.promoClasse;
import model.promoDAO;

/**
 * Servlet implementation class addAndViewPromo
 */
@WebServlet("/addAndViewPromo")
public class addAndViewPromo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAndViewPromo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		promoDAO promoDAO = new promoDAO();
		ArrayList<promoClasse> showAll = promoDAO.showAll();
		
		request.setAttribute("showAll", showAll);
		
		this.getServletContext().getRequestDispatcher("/promo.jsp").forward(request, response);
    	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String year = request.getParameter("yearPromo");
		promoClasse prmo1 = new promoClasse(year);
		promoDAO promo = new promoDAO();
		promo.addPromo(prmo1);
		response.sendRedirect("addAndViewPromo");


	
	
	}

}
