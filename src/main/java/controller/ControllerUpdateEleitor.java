package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor;
import model.Eleitor;


@WebServlet(name = "ControllerUpdateEleitor", urlPatterns = { "/ControllerUpdateEleitor" })
public class ControllerUpdateEleitor extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		// Deixando a Sessão Bala
		sessao = request.getSession();
		// Exibindo as paradas
		

		Eleitor eleitor = new Eleitor();
		eleitor.setId(  Long.parseLong(sessao.getAttribute("eleitor_id").toString()) );
		eleitor.setNome(sessao.getAttribute("nome").toString());
		eleitor.setTitulo(sessao.getAttribute("titulo").toString());
		eleitor.setSenha(sessao.getAttribute("senha").toString());


		DAO_Eleitor daoEleitor = new DAO_Eleitor();

		// try {
			
		// 	daoEleitor.atualizarEleitor(eleitor);			
		// 	response.sendRedirect("urna_virtual.jsp");		
			
		// } catch (Exception e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
	}

}
