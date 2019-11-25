package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.promoClasse;
import model.promoDAO;

/**
 * Servlet implementation class updatePromo
 */
@WebServlet("/updatePromo")
public class updatePromo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatePromo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		promoDAO promoDAO = new promoDAO();
		promoClasse promo = promoDAO.getYear(id);
		System.out.println(promo);
		
		request.setAttribute("promo", promo);

		this.getServletContext().getRequestDispatcher("/updategeneration.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		String year = request.getParameter("yearPromo");

		promoClasse generation = new promoClasse(year);
       promoDAO gene1 = new promoDAO();
       gene1.updatePromo(id, generation);
		response.sendRedirect("addAndViewPromo");


	
	}

}
