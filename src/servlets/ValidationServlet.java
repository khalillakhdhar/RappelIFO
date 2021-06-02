package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import validation.Datevalide;
import validation.ValidationDate;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
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
		//doGet(request, response);
		String message="";
		int j=Integer.parseInt(request.getParameter("jour"));
		int m=Integer.parseInt(request.getParameter("mois"));
		int a=Integer.parseInt(request.getParameter("an"));
		ValidationDate validation=new ValidationDate();
		Datevalide dt=new Datevalide(j, m, a);
		if(validation.validJour(dt.getJour(), dt.getMois(), dt.getAn()))
		{
			message=dt.toString()+" date valide";
			System.out.println(message);

		}
		else
		{
			message=dt.toString()+" date invalide";
			System.out.println(message);
		}
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		request.setAttribute("message",message);
			
			rd.forward(request, response);
		
		
		
	}

}
