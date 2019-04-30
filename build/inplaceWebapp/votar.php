<!DOCTYPE html>
<html lang="pt-br">
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
<?php 
setcookie('rm_escolar',null);
?>
      
    <body>
          <!-- Barra lateral -->
        
        <aside class="menu">
            
            <!-- Logo do Site -->
            <a href="index.php"><h2>LOGO</h2></a>
            
              <hr>
            
            <!-- Menu de navegacao -->
            
            <ul>
                <a  href="candidatos.php"><li style="background-image: url(_img/candidatos_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="votar.php"><li style="background-image: url(_img/vote_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="duvidas.php"><li style="background-image: url(_img/questions_buttom.png)" class="menu-nav">Candidatos</li></a>
            </ul>
            
          
            
            <!-- Copyright do site -->
            
            <a href="info.php" />
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
            
            <h2>Votar</h2> <br>
            
            <p>Para realizar o seu voto, por favor faça o Login com o seu RM escolar. <br>
            
            <br>
            
            <!-- Formulário de entrada -->
            
            <form name="entrar_rm" method="post" action="urna_virtual.php" >
                
                <input type="text" maxlength="6" class="rm" name="rm_escolar" id="rm" placeholder="RM escolar" style="color:grey;font-size:12pt;">
                <input type="submit" name="entrar" value="Entrar">
           
   
            </form>
            
        </article>
        
      
        <!-- *** -->
        
        
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
         
    </body>
</html>