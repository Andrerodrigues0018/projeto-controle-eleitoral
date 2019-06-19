
package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor;
import model.DAO_Voto;
import model.Eleitor;
import model.Voto;


@WebServlet(name = "ControllerVotar", urlPatterns = { "/ControllerVotar" })
public class ControllerVotar extends HttpServlet {

	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		// Deixando a Sessão Bala
		sessao = request.getSession();
		// Exibindo as paradas
		System.out.println("candidato_id: " + request.getParameter("candidato_id"));
		System.out.println("eleitor_id: " + sessao.getAttribute("eleitor_id").toString() );

		Voto v = new Voto();

		v.setCandidatoId(request.getParameter("candidato_id").toString());
		v.setEleitorId(sessao.getAttribute("eleitor_id").toString());
		
		DAO_Voto daoVoto = new DAO_Voto();
		
		try {
			
			daoVoto.cadastrarVoto(v);
			sessao.setAttribute("candidato_id", request.getParameter("candidato_id"));
			response.sendRedirect("confirmacao_voto.jsp");		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}