<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8" />
        <!-- CSS -->
        <link type="text/css" rel="stylesheet" href="../_css/index.css" />
        <link type="text/css" rel="stylesheet" href="../_css/votar.css" />
        <link rel="stylesheet" href="../_packs/font-awesome-4.6.3/css/font-awesome.css" />
        <meta name="viewport" content="width=device-width, height=device-heigt user-scalable=no">
        <meta name="author" content="Andre_Luis" />
        <meta name="kaywords" content="Controle_Eleitoral" />
    </head>
    <body>
         <!-- Barra lateral -->
        
        <aside class="menu">
            
            <!-- Logo do Site -->
            <a href="../index.php"><h2>LOGO</h2></a>
            
              <hr>
            
            <!-- Menu de navegacao -->
            
            <ul>
                <a  href="../candidatos.php"><li style="background-image: url(../_img/candidatos_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="../votar.php"><li style="background-image: url(../_img/vote_buttom.png)" class="menu-nav">Candidatos</li></a>
                <a  href="../duvidas.php"><li style="background-image: url(../_img/questions_buttom.png)" class="menu-nav">Candidatos</li></a>
            </ul>
            
          
            
            <!-- Copyright do site -->
            
            <a href="../info.php" />
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
        
        <!-- Litagem dos dados do usuario e sua votacao -->
        
        <section class="generic-se-ma" style="text-align: justify" >
            
            <h2>Votação</h2>
            
            <br>
            
            <!-- Dados -->
            
            <p>Nome do eleitor: João Vitor Ramos</p>
            <p>Instituição: ETEC PE. Carlos Leôncio da Silva</p>
            <p>Data do Voto: 18/05/2016</p>
            <p>Horário do voto: 12:39:43 (Brasília)</p>
            <p>Direção do voto: Diretor</p>
            <p>Candidato: Voto em branco</p>
            
            <figure class="etec-marca">
                <img src="../_img/marca_etecpadreleoncio_cps.png" />
            </figure>
            
            <!-- Foto do eleitor -->
            
            <div class="eleitor-foto">
                Foto
            </div>
            
            <!-- Código de barra -->
            
            <div class="codigo-barra">
                Codigo de barra
            </div>
            
        </section>
        
        <!-- Botoes de ação pós votacao -->
        
        <section class="generic-se-ma">
            
            Para confirmar seu voto, a impressão do mesmo deve ser efetuada. <br>
            
            <!-- Confirmar -->
            
            <button style="background-color: #1ba46a;" class="fa fa-print"> 
                <span> &nbsp; Imprimir e confirmar o voto </span></button>
            
            <!-- Refazer o voto -->
            
            <a href="../urna_virtual.php" />
            <button style="background-color: #e25555;" class="fa fa-times"> 
                <span> &nbsp; Cancelar e refazer o voto </span></button>
        </a>
            
        </section>
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
         
    </body>
</html>