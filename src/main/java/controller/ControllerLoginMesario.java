package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Mesario;
import model.Mesario;


@WebServlet(name = "ControllerLoginMesario", urlPatterns = { "/ControllerLoginMesario" })
public class ControllerLoginMesario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {


		Mesario mesario = new Mesario();
		mesario.setTitulo(request.getParameter("titulo"));
		mesario.setSenha(request.getParameter("senha"));
		DAO_Mesario validaLogin = new DAO_Mesario();
		
		try {			

			Mesario validaLoginBD = validaLogin.validarLogin(mesario);
			
			if (validaLoginBD.getTitulo().equals(mesario.getTitulo())) {
				System.out.println("entramos!!");				
				sessao = request.getSession();
				sessao.setAttribute("mesario_titulo", validaLoginBD.getTitulo());
				sessao.setAttribute("mesario_nome", validaLoginBD.getNome());				
				response.sendRedirect("lista_mesario.jsp");
			}
			else {
				// :3
				System.out.println("N entramu :3 !!");	
				response.sendRedirect("login_falho.jsp");
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
