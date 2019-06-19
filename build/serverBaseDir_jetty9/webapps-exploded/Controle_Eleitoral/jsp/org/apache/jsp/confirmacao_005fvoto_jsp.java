package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmacao_005fvoto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"_css/votar.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"_packs/font-awesome-4.6.3/css/font-awesome.css\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, height=device-heigt user-scalable=no\">\r\n");
      out.write("        <meta name=\"author\" content=\"Andre_Luis\" />\r\n");
      out.write("        <meta name=\"kaywords\" content=\"Controle_Eleitoral\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <!-- Barra lateral -->\r\n");
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
      out.write("        <!-- Litagem dos dados do usuario e sua votacao -->\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"generic-se-ma\" style=\"text-align: justify\" >\r\n");
      out.write("            \r\n");
      out.write("            <h2>Votação</h2>\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Dados -->\r\n");
      out.write("            \r\n");
      out.write("            <p>Nome do eleitor: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            <p>Titulo do eleitor: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            <p>Data do Voto: 18/05/2019</p>\r\n");
      out.write("            <p>Horário do voto: 12:39:43 (Brasília)</p>\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("            <figure class=\"etec-marca\">\r\n");
      out.write("                <img src=\"_img/marca_etecpadreleoncio_cps.png\" />\r\n");
      out.write("            </figure>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Foto do eleitor -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"eleitor-foto\" style=\"background-image: url('_img/candidato");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${candidato_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".jpg')\">\r\n");
      out.write("                Foto\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Código de barra -->\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"codigo-barra\">\r\n");
      out.write("                Codigo de barra\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Botoes de ação pós votacao -->\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"generic-se-ma\">\r\n");
      out.write("            \r\n");
      out.write("            Para confirmar seu voto, a impressão do mesmo deve ser efetuada. <br>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Confirmar -->\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"./\">  <button style=\"background-color: #1ba46a;\" class=\"fa fa-check\"> \r\n");
      out.write("                    <span> &nbsp;  Confirmar o voto </span></button></a>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Refazer o voto -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- <a href=\"urna_virtual.jsp\" />\r\n");
      out.write("                <button style=\"background-color: #e25555;\" class=\"fa fa-times\"> \r\n");
      out.write("                <span> &nbsp; Cancelar e refazer o voto </span></button>\r\n");
      out.write("            </a> -->\r\n");
      out.write("            \r\n");
      out.write("        </section>\r\n");
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
