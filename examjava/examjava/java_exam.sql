-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 04 juin 2024 à 04:27
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `java_exam`
--

-- --------------------------------------------------------

--
-- Structure de la table `classes`
--

CREATE TABLE `classes` (
  `class_id` int(11) NOT NULL,
  `libelle` varchar(100) NOT NULL,
  `niveau` varchar(50) NOT NULL,
  `filiere` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `classes`
--

INSERT INTO `classes` (`class_id`, `libelle`, `niveau`, `filiere`) VALUES
(1, 'Mathématiques avancées', 'Licence', 'Sciences mathématiques'),
(2, 'Langues étrangères', 'Master', 'Langues vivantes'),
(3, 'Informatique fondamentale', 'Bachelor', 'Informatique et technologies de l'information');

-- --------------------------------------------------------

--
-- Structure de la table `inscriptions`
--

CREATE TABLE `inscriptions` (
  `inscription_id` int(11) NOT NULL,
  `etudiant_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `date_inscription` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `inscriptions`
--

INSERT INTO `inscriptions` (`inscription_id`, `etudiant_id`, `class_id`, `date_inscription`) VALUES
(1, 1, 1, '2024-05-01'),
(2, 2, 3, '2024-05-03'),
(3, 3, 2, '2024-05-05');

-- --------------------------------------------------------

--
-- Structure de la table `professeurclasse`
--

CREATE TABLE `professeurclasse` (
  `prof_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `professeurs`
--

CREATE TABLE `professeurs` (
  `prof_id` int(11) NOT NULL,
  `nci` varchar(50) NOT NULL,
  `nom_complet` varchar(100) NOT NULL,
  `grade` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `professeurs`
--

INSERT INTO `professeurs` (`prof_id`, `nci`, `nom_complet`, `grade`) VALUES
(1, '123456789', 'Jean Dupont', 'Maître de conférences'),
(2, '987654321', 'Marie Leclerc', 'Professeur'),
(3, '456789123', 'Ahmed Khan', 'Assistant');

-- --------------------------------------------------------

--
-- Structure de la table `réinscriptions`
--

CREATE TABLE `réinscriptions` (
  `reinscription_id` int(11) NOT NULL,
  `etudiant_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `date_reinscription` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `réinscriptions`
--

INSERT INTO `réinscriptions` (`reinscription_id`, `etudiant_id`, `class_id`, `date_reinscription`) VALUES
(1, 1, 1, '2025-05-01'),
(2, 2, 3, '2025-05-03'),
(3, 3, 2, '2025-05-05');

-- --------------------------------------------------------

--
-- Structure de la table `étudiants`
--

CREATE TABLE `étudiants` (
  `etudiant_id` int(11) NOT NULL,
  `matricule` varchar(50) NOT NULL,
  `nom_complet` varchar(100) NOT NULL,
  `tuteur` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `étudiants`
--

INSERT INTO `étudiants` (`etudiant_id`, `matricule`, `nom_complet`, `tuteur`) VALUES
(1, '2023001', 'Aliou Diallo', 'Fatou Diallo'),
(2, '2023002', 'Aïcha Camara', 'Mariam Camara'),
(3, '2023003', 'Moussa Traoré', 'Amadou Traoré');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`class_id`);

--
-- Index pour la table `inscriptions`
--
ALTER TABLE `inscriptions`
  ADD PRIMARY KEY (`inscription_id`),
  ADD KEY `etudiant_id` (`etudiant_id`),
  ADD KEY `class_id` (`class_id`);

--
-- Index pour la table `professeurclasse`
--
ALTER TABLE `professeurclasse`
  ADD PRIMARY KEY (`prof_id`,`class_id`),
  ADD KEY `class_id` (`class_id`);

--
-- Index pour la table `professeurs`
--
ALTER TABLE `professeurs`
  ADD PRIMARY KEY (`prof_id`);

--
-- Index pour la table `réinscriptions`
--
ALTER TABLE `réinscriptions`
  ADD PRIMARY KEY (`reinscription_id`),
  ADD KEY `etudiant_id` (`etudiant_id`),
  ADD KEY `class_id` (`class_id`);

--
-- Index pour la table `étudiants`
--
ALTER TABLE `étudiants`
  ADD PRIMARY KEY (`etudiant_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `classes`
--
ALTER TABLE `classes`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `inscriptions`
--
ALTER TABLE `inscriptions`
  MODIFY `inscription_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `professeurs`
--
ALTER TABLE `professeurs`
  MODIFY `prof_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `réinscriptions`
--
ALTER TABLE `réinscriptions`
  MODIFY `reinscription_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `étudiants`
--
ALTER TABLE `étudiants`
  MODIFY `etudiant_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `inscriptions`
--
ALTER TABLE `inscriptions`
  ADD CONSTRAINT `inscriptions_ibfk_1` FOREIGN KEY (`etudiant_id`) REFERENCES `étudiants` (`etudiant_id`),
  ADD CONSTRAINT `inscriptions_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`);

--
-- Contraintes pour la table `professeurclasse`
--
ALTER TABLE `professeurclasse`
  ADD CONSTRAINT `professeurclasse_ibfk_1` FOREIGN KEY (`prof_id`) REFERENCES `professeurs` (`prof_id`),
  ADD CONSTRAINT `professeurclasse_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`);

--
-- Contraintes pour la table `réinscriptions`
--
ALTER TABLE `réinscriptions`
  ADD CONSTRAINT `réinscriptions_ibfk_1` FOREIGN KEY (`etudiant_id`) REFERENCES `étudiants` (`etudiant_id`),
  ADD CONSTRAINT `réinscriptions_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
