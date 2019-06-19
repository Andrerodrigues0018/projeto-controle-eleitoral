package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Eleitor;
import model.Eleitor;

import model.DAO_Voto;
import model.Voto;

@WebServlet(name = "ControllerLoginEleitor", urlPatterns = { "/ControllerLoginEleitor" })
public class ControllerLoginEleitor extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	HttpSession sessao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		// try {	

		// 	System.out.println(request.getParameter("titulo"));
		// 	sessao = request.getSession();
		// 	//response.sendRedirect("duvidas.jsp");
		// }catch (Exception e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }

		Eleitor eleitor = new Eleitor();
		eleitor.setTitulo(request.getParameter("titulo"));
		eleitor.setSenha(request.getParameter("senha"));
		System.out.println(" .. Recebida:"+ request.getParameter("senha"));	
		DAO_Eleitor validaLogin = new DAO_Eleitor();
		
		try {			

			Eleitor validaLoginBD = validaLogin.validarLogin(eleitor);
			
			if (validaLoginBD.getTitulo().equals(eleitor.getTitulo())) {
				System.out.println("entramos!!");				
				sessao = request.getSession();				
				sessao.setAttribute("eleitor_id", validaLoginBD.getId());
				sessao.setAttribute("titulo", validaLoginBD.getTitulo());
				sessao.setAttribute("nome", validaLoginBD.getNome());				
				sessao.setAttribute("senha", validaLoginBD.getSenha());	

				// Checando se Ja votou
				DAO_Voto daoVoto = new DAO_Voto();

				System.out.println("Eita.." + validaLoginBD.getId());

				Integer validaVoto = daoVoto.validarVoto( validaLoginBD.getId());
				
				System.out.println("Voto ID: - "+ validaVoto +" ID: "+validaLoginBD.getId());
				
				if ( validaVoto > 0 ) {
					System.out.println("Com voto!!");
					sessao.setAttribute("candidato_id", validaVoto);
					response.sendRedirect("confirmacao_voto.jsp");
				}else{
					System.out.println("Sem voto!!");
					response.sendRedirect("validar.jsp");
				}

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
