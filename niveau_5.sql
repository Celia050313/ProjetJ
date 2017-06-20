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
-- Structure de la table `niveau_5`
--

CREATE TABLE `niveau_5` (
  `ID` int(8) NOT NULL,
  `1` char(8) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL DEFAULT 'W',
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
  `14` char(8) DEFAULT 'D',
  `15` char(8) NOT NULL DEFAULT 'D',
  `16` char(8) NOT NULL DEFAULT 'D',
  `17` char(8) NOT NULL DEFAULT 'D',
  `18` char(8) NOT NULL DEFAULT 'D',
  `19` char(8) NOT NULL DEFAULT 'D',
  `20` char(8) NOT NULL DEFAULT 'D',
  `21` char(8) NOT NULL DEFAULT 'D',
  `22` char(8) NOT NULL DEFAULT 'D',
  `23` char(8) NOT NULL DEFAULT 'D',
  `24` char(8) NOT NULL DEFAULT 'D',
  `25` char(8) NOT NULL DEFAULT 'D',
  `26` char(8) NOT NULL DEFAULT 'D',
  `27` char(8) NOT NULL DEFAULT 'D',
  `28` char(8) NOT NULL DEFAULT 'D',
  `29` char(8) NOT NULL DEFAULT 'D',
  `30` char(8) NOT NULL DEFAULT 'W'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `niveau_5`
--

INSERT INTO `niveau_5` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`) VALUES
(1, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(2, 'W', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'W'),
(3, 'W', 'D', 'H', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(4, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(5, 'W', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'E', '', 'D', 'D', 'D', 'D', 'D', 'W'),
(6, 'W', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', '', '', 'D', 'D', 'D', 'D', 'D', 'W'),
(7, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(8, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(9, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'R', 'D', 'D', 'D', 'W'),
(10, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'R', 'D', 'D', 'D', 'W'),
(11, 'W', 'D', 'D', 'R', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(12, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', '', '', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(13, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(14, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(15, 'W', 'D', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(16, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(17, 'W', 'D', '', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'D', 'W'),
(18, 'W', 'D', '', 'E', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(19, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(20, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'E', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(21, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', '', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(22, 'W', 'D', 'R', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', '', '', 'D', 'D', 'D', 'W'),
(23, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(24, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(25, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(26, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(27, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'W'),
(28, 'W', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(29, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(30, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `niveau_5`
--
ALTER TABLE `niveau_5`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `niveau_5`
--
ALTER TABLE `niveau_5`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
