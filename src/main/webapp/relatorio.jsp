
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Relatorio"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <!-- CSS -->
        <link type="text/css" rel="stylesheet" href="_css/index.css" />
        <link type="text/css" rel="stylesheet" href="_css/votar.css" />
        <link rel="stylesheet" href="_packs/font-awesome-4.6.3/css/font-awesome.css" />
        <meta name="viewport" content="width=device-width, height=device-heigt user-scalable=no">
        <meta name="author" content="Andre_Luis" />
        <meta name="kaywords" content="Controle_Eleitoral" />
   <script type="text/javascript" src="_js/jquery.js"></script>
      
<script type="text/javascript" src="_js/jquery.maskedinput.js"></script>
</head>

    <body>
          <!-- Barra lateral -->
        
        <aside class="menu">
            
            <!-- Logo do Site -->
            <a href="index.jsp"><h2>LOGO</h2></a>
            
              <hr>
            
            <!-- Menu de navegacao -->
            
            <ul>
                <a  href="candidatos.jsp"><li style="background-image: url(_img/candidatos_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="votar.jsp"><li style="background-image: url(_img/vote_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="duvidas.jsp"><li style="background-image: url(_img/questions_buttom.png)" class="menu-nav">Candidatos</li></a>
            </ul>
            
          
            
            <!-- Copyright do site -->
            
            <a href="info.jsp" />
            <span>
                
                Informações oficiais
                
            </span>
        </a>
            
        </aside>
         
          <!-- Latera principal do site -->
        <!-- HEADER -->
        
        <header class="cabecalho">
            
            <h2>Sistema de controle Eleitoral</h2>
              
            
             <!-- Formulario de pesquisa da header -->
            
            <form class="search-form" method="post" action="">
                
                <input type="text" name="pesquisa">
               <!-- <input type="submit" name="pesquisar" value="<i>"> -->
                
                <button><i class="fa fa-search fa-2x" aria-hidden="true"></i></button>
                
            </form>
            
        </header>
        
        <!-- Apresentacao <IMAGEM E TEXTO> -->
        
        <article class="generic-se-ma">
            
            <h2>Mesário ${mesario_nome} -  Relatorio</h2> <br>
            
            <p>Abaixa estão as relações dos votos. <br>
            
            <br>
            
            <!-- Formulário de entrada -->
            
            <table style="width: 100%;margin-bottom: 50px;">
                <tr style="font-weight: bolder;">
                    <td> Candidato </td> <td> Qtd. Votos </td> <td> % </td> <td>Opção</td>
                </tr>
               
                <c:forEach items="${lv}" var="lv">
                    <tr>
                        <td >${lv.classificacao}</td>
                        <td >${lv.qtdeVotos}</td>
                        <td >${ ((lv.qtdeVotos * 100 ) / qtdTotal).intValue() }% </td>
                        <td ><a href="">Listar votos</a></td>
                    </tr>
                </c:forEach>
            </table>

                <a  class="button-option bo-1" style="text-align: center;width: auto;"> Imprimir </a>
            
        </article>
        
      
        <!-- *** -->
        
        
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
         
    </body>
</html>