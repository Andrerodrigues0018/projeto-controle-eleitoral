package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/index.css\" />\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/candidatos_style.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"_packs/font-awesome-4.6.3/css/font-awesome.css\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, height=device-heigt user-scalable=no\">\r\n");
      out.write("        <meta name=\"author\" content=\"Andre_Luis\" />\r\n");
      out.write("        <meta name=\"kaywords\" content=\"Controle_Eleitoral\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Barra lateral -->\r\n");
      out.write("        \r\n");
      out.write("        <aside class=\"menu\">\r\n");
      out.write("            \r\n");
      out.write("            <!-- Logo do Site -->\r\n");
      out.write("            <a href=\"index.jsp\"><h2>LOGO</h2></a>\r\n");
      out.write("            \r\n");
      out.write("              <hr>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Menu de navegacao -->\r\n");
      out.write("            \r\n");
      out.write("            <ul>\r\n");
      out.write("                <a  href=\"candidatos.jsp\"><li style=\"background-image: url(_img/candidatos_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\r\n");
      out.write("                <a  href=\"votar.jsp\"><li style=\"background-image: url(_img/vote_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\r\n");
      out.write("                <a  href=\"duvidas.jsp\"><li style=\"background-image: url(_img/questions_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("            <!-- Copyright do site -->\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"info.jsp\" />\r\n");
      out.write("            <span>\r\n");
      out.write("                \r\n");
      out.write("                Informações oficiais\r\n");
      out.write("                \r\n");
      out.write("            </span>\r\n");
      out.write("        </a>\r\n");
      out.write("            \r\n");
      out.write("        </aside>\r\n");
      out.write("         \r\n");
      out.write("          <!-- Latera principal do site -->\r\n");
      out.write("        <!-- HEADER -->\r\n");
      out.write("        \r\n");
      out.write("        <header class=\"cabecalho\">\r\n");
      out.write("            \r\n");
      out.write("            <h2>Sistema de controle Eleitoral</h2>\r\n");
      out.write("            \r\n");
      out.write("             <!-- Formulario de pesquisa da header -->\r\n");
      out.write("            \r\n");
      out.write("            <form class=\"search-form\" method=\"post\" >\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"text\" name=\"pesquisa\">\r\n");
      out.write("               <!-- <input type=\"submit\" name=\"pesquisar\" value=\"<i>\"> -->\r\n");
      out.write("                \r\n");
      out.write("                <button><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                \r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Apresentacao <IMAGEM E TEXTO> -->\r\n");
      out.write("        \r\n");
      out.write("        <article class=\"generic-se-ma\">\r\n");
      out.write("            \r\n");
      out.write("            <h2>Candidatos para diretor</h2>\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <p>Segue abaixo uma listagem dos candidatos á eleição, na qual você poderá\r\n");
      out.write("            ler e analisar suas propostas e em seguida (clicando no segundo botão do menu)\r\n");
      out.write("            realizar sua votação. Você pode ir para a página de votação também clicando <a href=\"votar.jsp\">aqui.</a></p>\r\n");
      out.write("            \r\n");
      out.write("        </article>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Generic candidato mostra -->\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"generic-se-ma\">\r\n");
      out.write("            \r\n");
      out.write("            <h2>Lista de Candidatos</h2> <br />\r\n");
      out.write("            \r\n");
      out.write("            <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("                <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("                  <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                  \r\n");
      out.write("                    <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                     \r\n");
      out.write("                      <!-- Candidato card -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"candidato_card\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- NOME/FOTO -->\r\n");
      out.write("                <h2>Tiririca</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Foto -->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"candidato_foto\">\r\n");
      out.write("                    foto\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- Descricao -->\r\n");
      out.write("                \r\n");
      out.write("                <p>\r\n");
      out.write("                    \r\n");
      out.write("                    Francisco Everardo Oliveira Silva[2] (Itapipoca, 1 de maio de 1965), \r\n");
      out.write("                    conhecido pelo nome artístico de Tiririca, é um cantor, compositor,\r\n");
      out.write("                    humorista, e político brasileiro. Filiado ao Partido da República, \r\n");
      out.write("                    Tiririca foi eleito deputado federal por São Paulo, tendo sido o\r\n");
      out.write("                    terceiro deputado mais votado em toda a história do Brasil, atrás \r\n");
      out.write("                    apenas de Enéas Carneiro e Celso Russomano.\r\n");
      out.write("                    \r\n");
      out.write("                </p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <!-- *** -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- Rodape do site -->\r\n");
      out.write("        \r\n");
      out.write("        <footer class=\"rodape\">\r\n");
      out.write("            \r\n");
      out.write("            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>\r\n");
      out.write("            <p>ETEC PE. Carlos Leôncio da Silva</p>\r\n");
      out.write("            \r\n");
      out.write("        </footer>\r\n");
      out.write("         \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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