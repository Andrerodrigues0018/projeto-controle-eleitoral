package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fchefe_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/index.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/votar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"_packs/font-awesome-4.6.3/css/font-awesome.css\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, height=device-heigt user-scalable=no\">\n");
      out.write("        <meta name=\"author\" content=\"Andre_Luis\" />\n");
      out.write("        <meta name=\"kaywords\" content=\"Controle_Eleitoral\" />\n");
      out.write("   <script type=\"text/javascript\" src=\"_js/jquery.js\"></script>\n");
      out.write("      \n");
      out.write("<script type=\"text/javascript\" src=\"_js/jquery.maskedinput.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("          <!-- Barra lateral -->\n");
      out.write("        \n");
      out.write("        <aside class=\"menu\">\n");
      out.write("            \n");
      out.write("            <!-- Logo do Site -->\n");
      out.write("            <a href=\"index.jsp\"><h2>LOGO</h2></a>\n");
      out.write("            \n");
      out.write("              <hr>\n");
      out.write("            \n");
      out.write("            <!-- Menu de navegacao -->\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("                <a  href=\"candidatos.jsp\"><li style=\"background-image: url(_img/candidatos_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("                <a  href=\"votar.jsp\"><li style=\"background-image: url(_img/vote_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("                <a  href=\"duvidas.jsp\"><li style=\"background-image: url(_img/questions_buttom.png)\" class=\"menu-nav\">Candidatos</li></a>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            <!-- Copyright do site -->\n");
      out.write("            \n");
      out.write("            <a href=\"info.jsp\" />\n");
      out.write("            <span>\n");
      out.write("                \n");
      out.write("                Informações oficiais\n");
      out.write("                \n");
      out.write("            </span>\n");
      out.write("        </a>\n");
      out.write("            \n");
      out.write("        </aside>\n");
      out.write("         \n");
      out.write("          <!-- Latera principal do site -->\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        \n");
      out.write("        <header class=\"cabecalho\">\n");
      out.write("            \n");
      out.write("            <h2>Sistema de controle Eleitoral</h2>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("             <!-- Formulario de pesquisa da header -->\n");
      out.write("            \n");
      out.write("            <form class=\"search-form\" method=\"post\" action=\"\">\n");
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
      out.write("        <!-- Apresentacao <IMAGEM E TEXTO> -->\n");
      out.write("        \n");
      out.write("        <article class=\"generic-se-ma\">\n");
      out.write("            \n");
      out.write("            <h2>Chefe de Sessao</h2> <br>\n");
      out.write("            \n");
      out.write("            <p>Para realizar o seu login, por favor faça o Login com o seus dados. <br>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <!-- Formulário de entrada -->\n");
      out.write("            \n");
      out.write("            <form name=\"entrar_rm\" method=\"post\" action=\"relatorio.jsp\" >\n");
      out.write("                \n");
      out.write("                <input type=\"text\" maxlength=\"6\" class=\"rm\" name=\"rm_escolar\" id=\"rm\" placeholder=\"Titulo Eleitoral\" style=\"color:grey;font-size:12pt;\">\n");
      out.write("                <input type=\"password\" maxlength=\"6\" class=\"rm\" name=\"rm_escolar\" id=\"rm\" placeholder=\"***********\"\n");
      out.write("                 style=\"color:grey;font-size:12pt;border:1px solid #ccc\">\n");
      out.write("                <input type=\"submit\" name=\"entrar\" value=\"Entrar\">\n");
      out.write("           \n");
      out.write("   \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </article>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <!-- *** -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Rodape do site -->\n");
      out.write("        \n");
      out.write("        <footer class=\"rodape\">\n");
      out.write("            \n");
      out.write("            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>\n");
      out.write("            <p>ETEC PE. Carlos Leôncio da Silva</p>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("         \n");
      out.write("    </body>\n");
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
