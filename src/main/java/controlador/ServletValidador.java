package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.LoginDao;
/**
 * Servlet implementation class ServletValidador
 */
public class ServletValidador extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletValidador() {
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
		String usuario, password, msg="";		
		usuario = request.getParameter("usuario");
		password = request.getParameter("password");		
		try {
			if(LoginDao.validar(usuario, password)>0) {
				//msg = "Usuario y contraseña correctos";
				msg = LoginDao.mostrarDatos();
			}else {
				msg = "Revise su usuario o contraseña";
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
		msg = msg.toUpperCase();		
		RequestDispatcher despachador = request.getRequestDispatcher("/mensaje.jsp");		
		request.setAttribute("mensaje", msg);	
		despachador.forward(request, response);
		
	}
}
