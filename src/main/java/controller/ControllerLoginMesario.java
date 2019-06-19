package controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO_Mesario;
import model.DAO_Voto;
import model.Mesario;
import model.Relatorio;

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
				


				// Capturando Votos
				DAO_Voto votosDAO = new DAO_Voto();
				List<Object[]> listaVotos = votosDAO.listarVotos();				
				List<Relatorio> lv = new LinkedList<>();
				
				int classificacao = 0;
				int qtdTotal = 0;
				String brancos = "0";
				String nulos = "0";
							
				for (Object[] objects : listaVotos) {
					
					classificacao += 1;

					System.out.println("QtdVotos:"+objects[0].toString());
					System.out.println("Candidato:"+objects[1].toString());
					qtdTotal += Integer.parseInt( objects[0].toString() );

					System.out.println("classificacao:"+classificacao);

					
					//System.out.println(objects[2].toString());
					Relatorio relatorio = new Relatorio();
					relatorio.setClassificacao(classificacao);
					relatorio.setCandidato(objects[1].toString());
					relatorio.setQtdeVotos(objects[0].toString());
					lv.add(relatorio);
				}
				System.out.println("Total:"+qtdTotal);
				System.out.println("lv: "+lv);
				
				request.getSession().setAttribute("lv", lv);
				request.getSession().setAttribute("qtdTotal", qtdTotal);

				request.getSession().setAttribute("brancos", brancos);
				request.getSession().setAttribute("nulos", nulos);
			    response.sendRedirect("relatorio.jsp");
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
