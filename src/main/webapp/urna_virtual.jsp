
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
          
            <script src="_js/jquery.js"></script>
        <meta name="kaywords" content="Controle_Eleitoral" />
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
            
            <form class="search-form" method="post" >
                
                <input type="text" name="pesquisa">
               <!-- <input type="submit" name="pesquisar" value="<i>"> -->
                
                <button><i class="fa fa-search fa-2x" aria-hidden="true"></i></button>
                
            </form>
            
        </header>
        
        <!-- Apresentacao <IMAGEM E TEXTO> -->
        
        <article class="generic-se-ma">
            
            <h2>Votação de ${nome} -  </h2> <br>
                <!-- <form method="post" action="ControllerUpdateEleitor">
                        <button type="submit">Editar</button>
                     </form> -->
          
            
            <p style="margin-left:50px;text-align: left"><b style="margin-left:-45px">Você foi habilitado para votar por ${mesario_nome}.</b><br>
                O processo de voto é bem simples, clique na imagem seguida do nome do candidato
                que você deseja eleger e instantaneamente seu voto é finalizado.</p>
            
            <br>
            
          
            
        </article>
        
        <!-- Urna box -->
        
        <section class="urna_box">
    
            <form method="post" action="ControllerVotar">    
                <h2>SEU VOTO PARA: PRESIDENTE</h2>
            
                <br>
            <!-- Listagem dos candidatos -->
            
            <!-- *** -->
            
            <figure class="candi-list">
                <label for="eleito-1">
                    <img src="_img/candidato1.jpg" alt="Tiririca">
                    <figcaption>Dilmãe <3 </figcaption>
                </label>
              <input type="radio" name="candidato_id" id="eleito-1" class="checkbox-buttom" value="1" checked/>
            </figure>
            
            <figure class="candi-list">
                <label for="eleito-2">
                    <img src="_img/candidato2.jpg" alt="Tiririca">
                    <figcaption>Bolsomito </figcaption>
                </label>
              <input type="radio" name="candidato_id" id="eleito-2" class="checkbox-buttom" value="2"/>
            </figure>

            <figure class="candi-list">
                <label for="eleito-3">
                    <img src="_img/candidato3.jpg" alt="Tiririca">
                    <figcaption>Daciolo &hearts; </figcaption>
                </label>
              <input type="radio" name="candidato_id" id="eleito-3" class="checkbox-buttom" value="3"/>
            </figure>

            
           
            <input type="submit" class="action-buttom">
             
            </form>
            <?php } ?>
        </section>
        
        <!-- Botões de ação -->
        
        <section class="generic-se-ma" >
            
            <a href="votar.jsp" style=" color: #ffffff; background-color: #ef3b3b;" class="action-buttom">Cancelar</a>
            
            <a href="_user_action/_votobranco.jsp"  style="color: #848484; background-color: #f1f1f1;" class="action-buttom">Votar em branco</a>
             
        </section>
      
       
        
        
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 André Luiz Rodrigues</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
         
    </body>
</html>