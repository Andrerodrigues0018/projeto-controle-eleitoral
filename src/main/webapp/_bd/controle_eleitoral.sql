-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09-Jun-2016 às 03:30
-- Versão do servidor: 10.0.17-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `controle_eleitoral`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleitores`
--

CREATE TABLE `eleitores` (
  `rm` varchar(40) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `instituicao` varchar(40) NOT NULL,
  `foto_perfil` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `eleitores`
--

INSERT INTO `eleitores` (`rm`, `nome`, `instituicao`, `foto_perfil`) VALUES
('140008', 'Andre luiz rodrigues de paulo', 'Etec PE. Carlos Leoncio da silva', '_user.png');

-- --------------------------------------------------------

--
-- Estrutura da tabela `votos`
--

CREATE TABLE `votos` (
  `codigo_voto` int(11) NOT NULL,
  `nome_eleitor` varchar(40) NOT NULL,
  `instituicao` varchar(40) NOT NULL,
  `data_voto` varchar(40) NOT NULL,
  `horario_voto` varchar(40) NOT NULL,
  `direcao_voto` varchar(40) NOT NULL,
  `candidatos` text NOT NULL,
  `rm` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `votos`
--

INSERT INTO `votos` (`codigo_voto`, `nome_eleitor`, `instituicao`, `data_voto`, `horario_voto`, `direcao_voto`, `candidatos`, `rm`) VALUES
(1, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:23:32', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(5, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:26:02', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(6, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:26:08', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(7, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:28:30', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(8, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:30:27', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(9, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:31:55', 'Diretor', 'tiririca,tiririca,tiririca', 123121),
(10, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:39:24', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(11, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:12', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(12, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:13', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(13, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:38', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(14, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:38', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(15, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:45', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(16, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:40:45', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(17, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:04', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(18, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:04', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(19, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:21', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(20, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:21', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(21, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:51', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(22, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:51', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(23, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:53', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(24, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:41:54', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(25, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:02', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(26, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:02', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(27, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:03', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(28, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:17', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(29, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:17', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(30, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:21', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(31, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:21', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(32, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:33', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(33, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:33', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(34, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:34', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(35, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:44', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(36, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:42:44', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(37, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:52:27', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(38, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:53:44', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(39, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:54:31', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(40, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '02:56:50', 'Diretor', 'tiririca,tiririca,tiririca', 123123),
(41, 'JoÃ£o Vitor Ramos', 'ETEC PE. Carlos LeÃ´ncio da Silva', '09-06-16', '03:21:44', 'Diretor', 'tiririca,tiririca,tiririca', 1231);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eleitores`
--
ALTER TABLE `eleitores`
  ADD PRIMARY KEY (`rm`);

--
-- Indexes for table `votos`
--
ALTER TABLE `votos`
  ADD PRIMARY KEY (`codigo_voto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `votos`
--
ALTER TABLE `votos`
  MODIFY `codigo_voto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
