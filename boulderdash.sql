-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Ven 23 Juin 2017 à 08:00
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

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `display_level_1` (IN `id` INT(255))  SELECT * FROM level_1 WHERE level_1.ID = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `display_level_2` ()  NO SQL
SELECT * FROM level_2 WHERE level_2.ID = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `display_level_3` ()  NO SQL
SELECT * FROM level_3 WHERE level_3.ID = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `display_level_5` ()  NO SQL
SELECT * FROM level_5 WHERE level_5.ID = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `dsiplay_level_4` ()  NO SQL
SELECT * FROM level_4 WHERE level_4.ID = id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `level_1`
--

CREATE TABLE `level_1` (
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
  `10` char(8) NOT NULL DEFAULT 'W',
  `11` char(8) NOT NULL DEFAULT 'D',
  `12` char(8) NOT NULL DEFAULT 'D',
  `13` char(8) NOT NULL DEFAULT 'D',
  `14` char(8) NOT NULL DEFAULT 'D',
  `15` char(8) NOT NULL DEFAULT 'W'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_1`
--

INSERT INTO `level_1` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`) VALUES
(1, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(2, 'W', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'W'),
(3, 'W', 'D', 'H', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(4, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'W'),
(5, 'W', 'D', 'D', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'M', 'D', 'W'),
(6, 'W', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'W'),
(7, 'W', 'D', 'D', 'D', 'D', 'D', '', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(8, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'W'),
(9, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(10, 'W', 'D', 'D', 'D', 'D', 'D', 'D', '', 'D', 'M', 'D', 'D', 'D', 'D', 'W'),
(11, 'W', 'D', 'M', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(12, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(13, 'W', 'D', 'D', '', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'S', 'M', 'W'),
(14, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'W'),
(15, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W');

-- --------------------------------------------------------

--
-- Structure de la table `level_1_metadatas`
--

CREATE TABLE `level_1_metadatas` (
  `Name` varchar(1000) NOT NULL,
  `Number` int(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_1_metadatas`
--

INSERT INTO `level_1_metadatas` (`Name`, `Number`) VALUES
('Diamonds', 9),
('Rocks', 0),
('Ennemies', 0),
('Level 1', 0);

-- --------------------------------------------------------

--
-- Structure de la table `level_2`
--

CREATE TABLE `level_2` (
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
  `15` char(8) NOT NULL DEFAULT 'W'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_2`
--

INSERT INTO `level_2` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`) VALUES
(1, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(2, 'W', 'D', '', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'W'),
(3, 'W', 'D', 'H', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(4, 'W', 'R', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'W'),
(5, 'W', 'D', 'D', 'D', 'R', 'D', 'D', 'M', 'D', '', 'D', 'D', 'M', 'D', 'W'),
(6, 'W', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(7, 'W', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'D', 'R', 'D', '', 'D', 'W'),
(8, 'W', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(9, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'W'),
(10, 'W', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(11, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', '', 'D', 'R', 'D', 'W'),
(12, 'W', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', '', 'D', 'D', 'D', 'D', 'W'),
(13, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'S', 'D', 'W'),
(14, 'W', 'D', 'D', 'M', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(15, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W');

-- --------------------------------------------------------

--
-- Structure de la table `level_2_metadatas`
--

CREATE TABLE `level_2_metadatas` (
  `Name` varchar(1000) NOT NULL,
  `Number` int(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_2_metadatas`
--

INSERT INTO `level_2_metadatas` (`Name`, `Number`) VALUES
('Diamonds', 9),
('Rocks', 9),
('Ennemies', 0),
('Level 2', 0);

-- --------------------------------------------------------

--
-- Structure de la table `level_3`
--

CREATE TABLE `level_3` (
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
-- Contenu de la table `level_3`
--

INSERT INTO `level_3` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`) VALUES
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

-- --------------------------------------------------------

--
-- Structure de la table `level_3_metadatas`
--

CREATE TABLE `level_3_metadatas` (
  `Name` varchar(1000) NOT NULL,
  `Number` int(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_3_metadatas`
--

INSERT INTO `level_3_metadatas` (`Name`, `Number`) VALUES
('Diamants', 9),
('Rocks', 17),
('Ennemis', 2),
('Level 3', 0);

-- --------------------------------------------------------

--
-- Structure de la table `level_4`
--

CREATE TABLE `level_4` (
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
  `10` char(8) DEFAULT 'D',
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
-- Contenu de la table `level_4`
--

INSERT INTO `level_4` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`) VALUES
(1, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(2, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(3, 'W', 'D', 'H', 'D', 'D', 'R', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'W'),
(4, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'W'),
(5, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(6, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(7, 'W', 'D', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(8, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'),
(9, 'W', 'D', 'D', 'W', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(10, 'W', 'R', 'R', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'D', '', '', 'D', 'D', 'D', 'W'),
(11, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'R', 'W', 'D', 'D', 'D', 'D', 'E', '', 'D', 'D', 'R', 'W'),
(12, 'W', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(13, 'W', 'D', 'D', 'D', 'W', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'W', 'W', 'W', 'D', 'D', 'W'),
(14, 'W', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(15, 'W', '', '', '', 'W', 'D', '', '', 'D', 'D', 'D', 'D', 'R', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(16, 'W', 'E', '', '', 'D', 'D', 'E', '', 'D', 'W', 'D', 'D', 'D', 'D', '', '', 'D', 'D', 'D', 'W'),
(17, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'E', '', 'D', 'D', 'D', 'W'),
(18, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'S', 'D', 'W'),
(19, 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'W'),
(20, 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W');

-- --------------------------------------------------------

--
-- Structure de la table `level_4_metadatas`
--

CREATE TABLE `level_4_metadatas` (
  `Name` varchar(1000) NOT NULL,
  `Number` int(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_4_metadatas`
--

INSERT INTO `level_4_metadatas` (`Name`, `Number`) VALUES
('Diamonds', 9),
('Rocks', 12),
('Ennemies', 4),
('Level 4', 0);

-- --------------------------------------------------------

--
-- Structure de la table `level_5`
--

CREATE TABLE `level_5` (
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
-- Contenu de la table `level_5`
--

INSERT INTO `level_5` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`) VALUES
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

-- --------------------------------------------------------

--
-- Structure de la table `level_5_metadatas`
--

CREATE TABLE `level_5_metadatas` (
  `Name` varchar(1000) NOT NULL,
  `Number` int(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `level_5_metadatas`
--

INSERT INTO `level_5_metadatas` (`Name`, `Number`) VALUES
('Diamonds', 9),
('Rocks', 20),
('Ennemies', 4),
('Level 5', 0);

-- --------------------------------------------------------

--
-- Structure de la table `list`
--

CREATE TABLE `list` (
  `ID_level` int(127) NOT NULL,
  `Name_level` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `list`
--

INSERT INTO `list` (`ID_level`, `Name_level`) VALUES
(1, 'Level 1 '),
(2, 'Level 2'),
(3, 'Level 3'),
(4, 'Level 4'),
(5, 'Level 5');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `level_1`
--
ALTER TABLE `level_1`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `level_1_metadatas`
--
ALTER TABLE `level_1_metadatas`
  ADD PRIMARY KEY (`Name`);

--
-- Index pour la table `level_2`
--
ALTER TABLE `level_2`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `level_2_metadatas`
--
ALTER TABLE `level_2_metadatas`
  ADD PRIMARY KEY (`Name`);

--
-- Index pour la table `level_3`
--
ALTER TABLE `level_3`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID` (`ID`),
  ADD KEY `ID_2` (`ID`);

--
-- Index pour la table `level_3_metadatas`
--
ALTER TABLE `level_3_metadatas`
  ADD PRIMARY KEY (`Name`);

--
-- Index pour la table `level_4`
--
ALTER TABLE `level_4`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `level_4_metadatas`
--
ALTER TABLE `level_4_metadatas`
  ADD PRIMARY KEY (`Name`);

--
-- Index pour la table `level_5`
--
ALTER TABLE `level_5`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Index pour la table `level_5_metadatas`
--
ALTER TABLE `level_5_metadatas`
  ADD PRIMARY KEY (`Name`);

--
-- Index pour la table `list`
--
ALTER TABLE `list`
  ADD PRIMARY KEY (`ID_level`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `level_1`
--
ALTER TABLE `level_1`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT pour la table `level_2`
--
ALTER TABLE `level_2`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT pour la table `level_3`
--
ALTER TABLE `level_3`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT pour la table `level_5`
--
ALTER TABLE `level_5`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT pour la table `list`
--
ALTER TABLE `list`
  MODIFY `ID_level` int(127) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
