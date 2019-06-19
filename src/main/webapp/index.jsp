
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
        <meta charset="UTF-8">
        <title>Controle eleitoral</title>
        <link type="text/css" rel="stylesheet" href="_css/index.css" />
        <meta name="viewport" content="width=device-width, height=device-heigt user-scalable=no">
        <link rel="stylesheet" href="_packs/font-awesome-4.6.3/css/font-awesome.css" />
        <meta name="author" content="Andre_Luis" />
        <meta name="kaywords" content="Controle_Eleitoral" />
        
        <!-- Estilizações particulares -->
        
        <style>
            
            p {
                margin-top: 10px;
                color: #868686
            }
            
        </style>
        
    </head>
    <body>
        
        <!-- Barra lateral -->
        
        <aside class="menu">
            
            <!-- Logo do Site -->
            <h2>LOGO</h2>
            
              <hr>
            
            <!-- Menu de navegacao -->
            
            <ul>
                <a  href="candidatos.jsp"><li style="background-image: url(_img/candidatos_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="votar.jsp"><li style="background-image: url(_img/vote_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="duvidas.jsp"><li style="background-image: url(_img/questions_buttom.png)" class="menu-nav">Candidatos</li></a>
               <!--  <a  href="duvidas.jsp"><li style="background-image: url(_img/info_buttom.png)" class="menu-nav">Candidatos</li></a> -->
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
        
        <!-- SLIDER -->
        
        <section  class="generic-se-ma">
            
            *** SLIDIZINHO***
            
        </section>
        
        <!-- Apresentacao <IMAGEM E TEXTO> -->
        
        <article class="generic-se-ma">
            
            <h2>Boas vindas</h2>
            
            <p> Saudações eleitor! Bem Vindo ao sistema de controle eleitoral da FATEC, com ele
            você poderá efetuar a sua votação de maneira rápida, prática, dinâmica e segura com o
            nosso sistema de impressão dos votos. Através de uma interface amigável e direta, a eleição
            poderá ocorrer rapidamente, assim todos votam em um curto período de tempo e o resultado
            poderá ser imediatamente exibido.</p>
            
            <!-- Imagem ilustrativa -->
            
            <figure class="index-fig" >
                
                <img src="_img/eleicoes.png" alt="eleições" />
                
            </figure>
            
             <h2>Não perca tempo!</h2>
            
            <p> Se você é estudante da etec você deve estar votando em um candidato nessas eleções.
            Com o auxilio de seu RM escolar, você poderá estar manueseando o sistema e realizar o seu voto.</p>
            
             <!-- Imagem ilustrativa -->
            
            <figure class="index-fig" >
                
                <img src="_img/beautiful.png" alt="Foto dos alunos s2" />
                
            </figure>
            
             <h2>Controle eleitoral</h2>
             
            <p> Portanto fique a vontade para navegar pelo sistema, e caso esteja com dúvidas, clique
            no botão com uma lâmpada para esclarecer todas as dúvidas frequêntes.</p>
            
             <!-- Imagem ilustrativa -->
            
            <figure class="index-fig" >
                
                <img src="_img/etec.png" alt="Etec Pe Carlos Leoncio da Silva" />
                
            </figure>
            
        </article>
        
        <!-- Locaização da instituição -->
        
        <section class="generic-se-ma" style="text-align: justify;" >
            
            <h2>Endereço e contato</h2>
            
            <br>
            
            <p>Endereço: Avenida Doutor Epitácio Santiago,199 - Centro, Lorena - SP, 12600-530</p>
            
            <p>Telefone:(12) 3157-8787<p/>
            
            <!-- Iframe do mapa -->
            
            <iframe  src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3679.8
                    889382313987!2d-45.130516184522875!3d-22.732369037386608!2m3!1f0!2f
                    0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ccc8eb8dd29fef%3A0x1c784
                    aab7cac06e!2sEtec+Padre+Carlos+Le%C3%B4ncio+da+Silva!5e0!3m2!1spt-BR!2sbr!
                    4v1463678206755" width="300" height="225" frameborder="0" style="border:0" allowfullscreen>
                        
            </iframe>
            
        </section>
        
        <!-- Mini Instrucoes -->
        
        <section  class="generic-se-ma">
            
            <p>A navegação atrevés deste site pode ser realizada a partir dos ícones
                localizados na lateral esquerd do site.</p> <br>
            <p>Os itens se referem respectivamente á: Conhecer os candidatos; Realizar o voto; Tirar as dúvidas e informações sobre o sistema.</p> <br>
            
            <figure>
                <img src="_img/buttom_tape.png" alt="icones-de-navegacao" />
            </figure>
            
        </section>
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
        
    </body>
</html>
