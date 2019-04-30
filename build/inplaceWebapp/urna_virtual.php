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
          
            <script src="_js/jquery.js"></script>
        <meta name="kaywords" content="Controle_Eleitoral" />
    </head>
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
            
            <form class="search-form" method="post" >
                
                <input type="text" name="pesquisa">
               <!-- <input type="submit" name="pesquisar" value="<i>"> -->
                
                <button><i class="fa fa-search fa-2x" aria-hidden="true"></i></button>
                
            </form>
            
        </header>
        
        <!-- Apresentacao <IMAGEM E TEXTO> -->
        
        <article class="generic-se-ma">
            
            <h2>Votar</h2> <br>
            
            <p>O processo de voto é bem simples, clique na imagem seguida do nome do candidato
                que você deseja eleger e instantaneamente seu voto é finalizado.</p>
            
            <br>
            
          
            
        </article>
        
        <!-- Urna box -->
        
        <section class="urna_box">
        <?php
            $vote=false;
            include'_user_action/conexao.php';
            if(isset($_COOKIE['rm_escolar'])){
                $rm=$_COOKIE['rm_escolar']; 
                echo"cookie $rm";
            }else{
                $rm = $_POST['rm_escolar'];
                setcookie('rm_escolar',$rm);
                echo"Post $rm";
            }


            $row = 0;
            # Validação de Voto;
            $consulta = $pdo->query("SELECT * FROM votos WHERE rm='$rm' ");
            while ($linha = $consulta->fetch(PDO::FETCH_ASSOC)) { $row++; }

            if ($row > 0) { $vote=true;  ?>  
                <h1> Um voto com seu RM foi encontrado </h1>
                <h2 style="font-weight:100;">Redirecionando para seu voto! </h2> 
                <meta http-equiv='refresh' content='1.5; url=_user_action/impressao_voto.php'>
            <?php }else{ ?>
            <form method="post" action="_user_action/_voto.php">    
                <h2>SEU VOTO PARA: DIRETOR</h2>
            
                <br>
            <!-- Listagem dos candidatos -->
            
            <!-- *** -->
          
            <figure class="candi-list">
                
                <img src="_img/Tiririca.jpg" alt="Tiririca">
                <figcaption>Francisco Everardo Oliveira </figcaption>
              <input type="checkbox" id="rdo_no_checked" class="checkbox-buttom" />
            </figure>
      
            
            <!-- *** -->
  
            <figure class="candi-list">
                
                <img src="_img/Tiririca.jpg" alt="Tiririca">
                <figcaption>Francisco Everardo Oliveira </figcaption>
                 <input type="checkbox" value="" class="checkbox-buttom" />
                
            </figure>
            <figure class="candi-list">
                
                <img src="_img/Tiririca.jpg" alt="Tiririca">
                <figcaption>Francisco Everardo Oliveira </figcaption>
                 <input type="checkbox" value="" class="checkbox-buttom" />
                
            </figure>
            <figure class="candi-list">
                
                <img src="_img/Tiririca.jpg" alt="Tiririca">
                <figcaption>Francisco Everardo Oliveira </figcaption>
                 <input type="checkbox" value="" class="checkbox-buttom" />
                
            </figure>
            <figure class="candi-list" style="margin-bottom:20px;">
                
                <img src="_img/Tiririca.jpg" alt="Tiririca">
                <figcaption>Francisco Everardo Oliveira </figcaption>
                 <input type="checkbox" value="" class="checkbox-buttom"  />
                
            </figure><br>
            <input type="submit" class="action-buttom">
             
            </form>
            <?php } ?>
        </section>
        
        <!-- Botões de ação -->
        
        <section class="generic-se-ma" >
            <?php if ($vote==TRUE){ ?>
            
            <?php }else{ ?>
            <a href="votar.php" style=" color: #ffffff; background-color: #ef3b3b;" class="action-buttom">Cancelar</a>
            
            <a href="_user_action/_votobranco.php"  style="color: #848484; background-color: #f1f1f1;" class="action-buttom">Votar em branco</a>
              <?php }?>
        </section>
      
       
        
        
        
        <!-- Rodape do site -->
        
        <footer class="rodape">
            
            <p>®Copyright 2016 Andre Luis Rodrigues e João Vitor Ramos</p>
            <p>ETEC PE. Carlos Leôncio da Silva</p>
            
        </footer>
         
    </body>
</html>