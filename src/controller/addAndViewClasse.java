package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.classe;
import model.classeDAO;
import model.promoClasse;
import model.promoDAO;

/**
 * Servlet implementation class addAndViewClasse
 */
@WebServlet("/addAndViewClasse")
public class addAndViewClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAndViewClasse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameClasse = request.getParameter("nameClasse");
		String nickName = request.getParameter("nickName");
		int id = Integer.parseInt(request.getParameter("id"));
        promoDAO promo = new promoDAO();
        promoClasse promo1 = promo.getYear(id);

		classe classe = new classe(nameClasse,nickName,promo1);
		classeDAO classeDAO = new classeDAO();
		
	}

}
