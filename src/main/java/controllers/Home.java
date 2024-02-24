package controllers;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EstadoSesion;

/**
 *
 * @author herna
 */
@WebServlet ("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * inicializa la sesión si no estaba creada 
         * esto lo logra fijandose en el atributo "páginas navegadas" el cual si se encuentra nunll lo inicializa en 0
         * además se fija en el atributo "estado_sesion" el cual si es null lo inicializa en "NO_LOGIN"
	 * @param request 
	 */
         
	public static void initSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("paginas_navegadas") == null) {
			session.setAttribute("paginas_navegadas", 0);
		}
		if (session.getAttribute("estado_sesion") == null) {
			session.setAttribute("estado_sesion", EstadoSesion.NO_LOGIN);
		}
                if (session.getAttribute("tipo_usuario") == null) {
			session.setAttribute("tipo_usuario", "visitante");
		}
	}
	
	/**
	 * Devuelve el estado de la sesión
	 * @param request
	 * @return 
	 */
	public static EstadoSesion getEstado(HttpServletRequest request)
	{
		return (EstadoSesion) request.getSession().getAttribute("estado_sesion");
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//se llama a esta función para verificar el estado de la sesión (en caso de que no esté inicializada, se inicializa)

                initSession(req);
		
		switch(getEstado(req)){
			case NO_LOGIN:
				req.getRequestDispatcher("views/welcome/welcome.jsp").
						forward(req, resp);
				break;
			case LOGIN_INCORRECTO:
				req.getRequestDispatcher("inicioErroneo.jsp").
						forward(req, resp);
				break;
			case LOGIN_CORRECTO:
                                HttpSession session = req.getSession();
                                String usu = (String)session.getAttribute("usuario_logueado");
                                req.setAttribute("nick", usu);
                                RequestDispatcher dispatcher = req.getRequestDispatcher("/consultarUsuario");
                                dispatcher.forward(req, resp);
				break;
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}