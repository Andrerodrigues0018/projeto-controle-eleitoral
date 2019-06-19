package org.apache.jsp._005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Controle eleitoral</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/index.css\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, height=device-heigt user-scalable=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"_packs/font-awesome-4.6.3/css/font-awesome.css\" />\n");
      out.write("        <meta name=\"author\" content=\"Andre_Luis\" />\n");
      out.write("        <meta name=\"kaywords\" content=\"Controle_Eleitoral\" />\n");
      out.write("        \n");
      out.write("        <!-- EstilizaÃ§Ãµes particulares -->\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            p {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                color: #868686\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- Barra lateral -->\n");
      out.write("        \n");
      out.write("        <aside class=\"menu\">\n");
      out.write("            \n");
      out.write("            <!-- Logo do Site -->\n");
      out.write("            <h2>LOGO</h2>\n");
      out.write("            \n");
      out.write("              <hr>\n");
      out.write("            \n");
      out.write("            <!-- Menu de navegacao -->\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <a  href=\"candidatos.html\"><li style=\"background-image: url(_img/candidatos_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("                <a  href=\"votar.html\"><li style=\"background-image: url(_img/vote_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("                <a  href=\"duvidas.html\"><li style=\"background-image: url(_img/questions_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("               <!--  <a  href=\"duvidas.html\"><li style=\"background-image: url(_img/info_buttom.png)\" class=\"menu-nav\">Candidatos</li></a> -->\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <!-- Copyright do site -->\n");
      out.write("            \n");
      out.write("            <a href=\"info.html\" />\n");
      out.write("            <span>\n");
      out.write("                \n");
      out.write("                InformaÃ§Ãµes oficiais\n");
      out.write("                \n");
      out.write("            </span>\n");
      out.write("        </a>\n");
      out.write("            \n");
      out.write("        </aside>\n");
      out.write("        \n");
      out.write("        <!-- Latera principal do site -->\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        \n");
      out.write("        <header class=\"cabecalho\">\n");
      out.write("            \n");
      out.write("            <h2>Sistema de controle Eleitoral</h2>\n");
      out.write("            \n");
      out.write("            <!-- Formulario de pesquisa da header -->\n");
      out.write("            \n");
      out.write("            <form class=\"search-form\" method=\"post\" >\n");
      out.write("                \n");
      out.write("                <input type=\"text\" name=\"pesquisa\">\n");
      out.write("               <!-- <input type=\"submit\" name=\"pesquisar\" value=\"<i>\"> -->\n");
      out.write("                \n");
      out.write("                <button><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\"></i></button>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <!-- SLIDER -->\n");
      out.write("        \n");
      out.write("        <section  class=\"generic-se-ma\">\n");
      out.write("            \n");
      out.write("            *** SLIDIZINHO***\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <!-- Apresentacao <IMAGEM E TEXTO> -->\n");
      out.write("        \n");
      out.write("        <article class=\"generic-se-ma\">\n");
      out.write("            \n");
      out.write("            <h2>Boas vindas</h2>\n");
      out.write("            \n");
      out.write("            <p> SaudaÃ§Ãµes eleitor! Bem Vindo ao sistema de controle eleitoral da FATEC, com ele\n");
      out.write("            vocÃª poderÃ¡ efetuar a sua votaÃ§Ã£o de maneira rÃ¡pida, prÃ¡tica, dinÃ¢mica e segura com o\n");
      out.write("            nosso sistema de impressÃ£o dos votos. AtravÃ©s de uma interface amigÃ¡vel e direta, a eleiÃ§Ã£o\n");
      out.write("            poderÃ¡ ocorrer rapidamente, assim todos votam em um curto perÃ­odo de tempo e o resultado\n");
      out.write("            poderÃ¡ ser imediatamente exibido.</p>\n");
      out.write("            \n");
      out.write("            <!-- Imagem ilustrativa -->\n");
      out.write("            \n");
      out.write("            <figure class=\"index-fig\" >\n");
      out.write("                \n");
      out.write("                <img src=\"_img/eleicoes.png\" alt=\"eleiÃ§Ãµes\" />\n");
      out.write("                \n");
      out.write("            </figure>\n");
      out.write("            \n");
      out.write("             <h2>NÃ£o perca tempo!</h2>\n");
      out.write("            \n");
      out.write("            <p> Se vocÃª Ã© estudante da etec vocÃª deve estar votando em um candidato nessas eleÃ§Ãµes.\n");
      out.write("            Com o auxilio de seu RM escolar, vocÃª poderÃ¡ estar manueseando o sistema e realizar o seu voto.</p>\n");
      out.write("            \n");
      out.write("             <!-- Imagem ilustrativa -->\n");
      out.write("            \n");
      out.write("            <figure class=\"index-fig\" >\n");
      out.write("                \n");
      out.write("                <img src=\"_img/beautiful.png\" alt=\"Foto dos alunos s2\" />\n");
      out.write("                \n");
      out.write("            </figure>\n");
      out.write("            \n");
      out.write("             <h2>Controle eleitoral</h2>\n");
      out.write("             \n");
      out.write("            <p> Portanto fique a vontade para navegar pelo sistema, e caso esteja com dÃºvidas, clique\n");
      out.write("            no botÃ£o com uma lÃ¢mpada para esclarecer todas as dÃºvidas frequÃªntes.</p>\n");
      out.write("            \n");
      out.write("             <!-- Imagem ilustrativa -->\n");
      out.write("            \n");
      out.write("            <figure class=\"index-fig\" >\n");
      out.write("                \n");
      out.write("                <img src=\"_img/etec.png\" alt=\"Etec Pe Carlos Leoncio da Silva\" />\n");
      out.write("                \n");
      out.write("            </figure>\n");
      out.write("            \n");
      out.write("        </article>\n");
      out.write("        \n");
      out.write("        <!-- LocaizaÃ§Ã£o da instituiÃ§Ã£o -->\n");
      out.write("        \n");
      out.write("        <section class=\"generic-se-ma\" style=\"text-align: justify;\" >\n");
      out.write("            \n");
      out.write("            <h2>EndereÃ§o e contato</h2>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <p>EndereÃ§o: Avenida Doutor EpitÃ¡cio Santiago,199 - Centro, Lorena - SP, 12600-530</p>\n");
      out.write("            \n");
      out.write("            <p>Telefone:(12) 3157-8787<p/>\n");
      out.write("            \n");
      out.write("            <!-- Iframe do mapa -->\n");
      out.write("            \n");
      out.write("            <iframe  src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3679.8\n");
      out.write("                    889382313987!2d-45.130516184522875!3d-22.732369037386608!2m3!1f0!2f\n");
      out.write("                    0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ccc8eb8dd29fef%3A0x1c784\n");
      out.write("                    aab7cac06e!2sEtec+Padre+Carlos+Le%C3%B4ncio+da+Silva!5e0!3m2!1spt-BR!2sbr!\n");
      out.write("                    4v1463678206755\" width=\"300\" height=\"225\" frameborder=\"0\" style=\"border:0\" allowfullscreen>\n");
      out.write("                        \n");
      out.write("            </iframe>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <!-- Mini Instrucoes -->\n");
      out.write("        \n");
      out.write("        <section  class=\"generic-se-ma\">\n");
      out.write("            \n");
      out.write("            <p>A navegaÃ§Ã£o atrevÃ©s deste site pode ser realizada a partir dos Ã­cones\n");
      out.write("                localizados na lateral esquerd do site.</p> <br>\n");
      out.write("            <p>Os itens se referem respectivamente Ã¡: Conhecer os candidatos; Realizar o voto; Tirar as dÃºvidas e informaÃ§Ãµes sobre o sistema.</p> <br>\n");
      out.write("            \n");
      out.write("            <figure>\n");
      out.write("                <img src=\"_img/buttom_tape.png\" alt=\"icones-de-navegacao\" />\n");
      out.write("            </figure>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <!-- Rodape do site -->\n");
      out.write("        \n");
      out.write("        <footer class=\"rodape\">\n");
      out.write("            \n");
      out.write("            <p>Â®Copyright 2016 Andre Luis Rodrigues e JoÃ£o Vitor Ramos</p>\n");
      out.write("            <p>ETEC PE. Carlos LeÃ´ncio da Silva</p>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
