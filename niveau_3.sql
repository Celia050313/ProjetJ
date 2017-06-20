-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mar 20 Juin 2017 à 06:55
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `boulderdash_v2`
--

-- --------------------------------------------------------

--
-- Structure de la table `niveau_3`
--

CREATE TABLE `niveau_3` (
  `ID` int(8) NOT NULL,
  `1` char(8) NOT NULL DEFAULT 'W',
  `2` char(8) NOT NULL DEFAULT 'D',
  `3` char(8) NOT NULL DEFAULT 'D',
  `4` char(8) NOT NULL DEFAULT 'D',
  `5` char(8) NOT NULL DEFAULT 'D',
  `6` char(8) NOT NULL DEFAULT 'D',
  `7` char(8) NOT NULL DEFAULT 'D',
  `8` char(8) NOT NULL DEFAULT 'D',
  `9` char(8) NOT NULL DEFAULT 'D',
  `10` char(8) NOT NULL DEFAULT 'D',
  `11` char(8) NOT NULL DEFAULT 'D',
  `12` char(8) NOT NULL DEFAULT 'D',
  `13` char(8) NOT NULL DEFAULT 'D',
  `14` char(8) NOT NULL DEFAULT 'D',
  `15` char(8) NOT NULL DEFAULT 'D',
  `16` char(8) NOT NULL DEFAULT 'D',
  `17` char(8) NOT NULL DEFAULT 'D',
  `18` char(8) NOT NULL DEFAULT 'D',
  `19` char(8) NOT NULL DEFAULT 'D',
  `20` char(8) NOT NULL DEFAULT 'W'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `niveau_3`
--

INSERT INTO `niveau_3` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`) VALUES
(1, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(2, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'W', '', '', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'M', 'W'),
(3, 'W', 'D', 'H', 'D', 'D', 'D', 'D', 'W', '', '', 'W', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'W'),
(4, 'W', 'D', 'D', 'D', 'D', 'R', 'D', 'W', 'E', '', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(5, 'W', 'D', 'D', 'D', 'M', 'D', 'D', 'R', 'W', 'W', 'R', '', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'W'),
(6, 'W', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(7, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'W'),
(8, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(9, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'W'),
(10, 'W', 'D', 'D', 'D', 'R', 'R', 'D', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(11, 'W', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'W'),
(12, 'W', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(13, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(14, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'W'),
(15, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(16, 'W', 'D', 'D', 'D', 'R', 'D', 'D', 'R', 'W', 'W', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(17, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'W', '', '', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(18, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'W', '', '', 'W', 'D', 'D', 'D', 'D', 'M', 'D', 'S', 'D', 'W'),
(19, 'W', 'D', 'D', 'M', 'D', 'D', 'D', 'W', '', '', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(20, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `niveau_3`
--
ALTER TABLE `niveau_3`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `ID_2` (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `niveau_3`
--
ALTER TABLE `niveau_3`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
