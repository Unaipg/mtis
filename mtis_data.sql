-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2016 at 05:44 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mtis`
--

-- --------------------------------------------------------

--
-- Table structure for table `activities`
--

CREATE TABLE IF NOT EXISTS `activities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `description` text NOT NULL,
  `type` varchar(100) NOT NULL,
  `price` float NOT NULL,
  `totalplaces` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `city` (`city`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `activities`
--

INSERT INTO `activities` (`id`, `name`, `date`, `description`, `type`, `price`, `totalplaces`, `city`) VALUES
(1, 'Paseo por el parque', '2016-05-31', 'Bonito paseo por el parque más típico de la ciudad.', 'Aire libre', 5, 20, 11),
(2, 'Visita al museo', '2016-05-31', 'Visita al museo donde podrás ver momias y piedras y momias petrificadas.', 'Cultura', 15, 10, 11);

-- --------------------------------------------------------

--
-- Table structure for table `activitybooking`
--

CREATE TABLE IF NOT EXISTS `activitybooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activity` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `activity` (`activity`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `airports`
--

CREATE TABLE IF NOT EXISTS `airports` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` int(11) NOT NULL,
  `name` varchar(150) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `city` (`country`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `airports`
--

INSERT INTO `airports` (`id`, `country`, `name`) VALUES
(1, 1, 'Barajas'),
(2, 1, 'Castellón');

-- --------------------------------------------------------

--
-- Table structure for table `carbooking`
--

CREATE TABLE IF NOT EXISTS `carbooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car` int(11) NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `car` (`car`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--

CREATE TABLE IF NOT EXISTS `cars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` int(11) NOT NULL,
  `model` varchar(100) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `city` (`city`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `cars`
--

INSERT INTO `cars` (`id`, `city`, `model`, `price`) VALUES
(1, 11, 'Ford fiesta', 20),
(2, 11, 'Tesla model S', 100);

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE IF NOT EXISTS `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `country` (`country`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`id`, `country`, `name`) VALUES
(11, 1, 'Madrid'),
(12, 2, 'Paris'),
(13, 1, 'Barcelona'),
(14, 3, 'London'),
(15, 4, 'Rome');

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--

CREATE TABLE IF NOT EXISTS `countries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `countries`
--

INSERT INTO `countries` (`id`, `name`) VALUES
(1, 'Spain'),
(2, 'France'),
(3, 'United Kingdom'),
(4, 'Italy'),
(5, 'Germany');

-- --------------------------------------------------------

--
-- Table structure for table `flightbooking`
--

CREATE TABLE IF NOT EXISTS `flightbooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flight` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `flight` (`flight`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `flights`
--

CREATE TABLE IF NOT EXISTS `flights` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `airport` int(11) NOT NULL,
  `date` date NOT NULL,
  `price` float NOT NULL,
  `totalplaces` int(11) NOT NULL,
  `destination` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `airport` (`airport`),
  KEY `destination` (`destination`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `flights`
--

INSERT INTO `flights` (`id`, `airport`, `date`, `price`, `totalplaces`, `destination`) VALUES
(1, 1, '2016-05-31', 100, 250, 2),
(2, 2, '2016-05-31', 100, 249, 1);

-- --------------------------------------------------------

--
-- Table structure for table `hotelbooking`
--

CREATE TABLE IF NOT EXISTS `hotelbooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room` int(11) NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `room` (`room`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

CREATE TABLE IF NOT EXISTS `hotels` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `city` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `city` (`city`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `hotels`
--

INSERT INTO `hotels` (`id`, `name`, `city`) VALUES
(1, 'Hotel bonito', 11),
(2, 'Hotel menos bonito', 11);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE IF NOT EXISTS `rooms` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel` int(11) NOT NULL,
  `class` varchar(50) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `hotel` (`hotel`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `hotel`, `class`, `price`) VALUES
(1, 1, 'premium', 100),
(2, 2, 'turista', 35),
(3, 1, 'turista', 50),
(4, 2, 'reducido', 20);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `activities`
--
ALTER TABLE `activities`
  ADD CONSTRAINT `activities_ibfk_1` FOREIGN KEY (`city`) REFERENCES `cities` (`id`);

--
-- Constraints for table `activitybooking`
--
ALTER TABLE `activitybooking`
  ADD CONSTRAINT `activityBooking_ibfk_1` FOREIGN KEY (`activity`) REFERENCES `activities` (`id`);

--
-- Constraints for table `airports`
--
ALTER TABLE `airports`
  ADD CONSTRAINT `airports_ibfk_1` FOREIGN KEY (`country`) REFERENCES `countries` (`id`);

--
-- Constraints for table `carbooking`
--
ALTER TABLE `carbooking`
  ADD CONSTRAINT `carBooking_ibfk_1` FOREIGN KEY (`car`) REFERENCES `cars` (`id`);

--
-- Constraints for table `cars`
--
ALTER TABLE `cars`
  ADD CONSTRAINT `cars_ibfk_1` FOREIGN KEY (`city`) REFERENCES `cities` (`id`);

--
-- Constraints for table `cities`
--
ALTER TABLE `cities`
  ADD CONSTRAINT `cities_ibfk_1` FOREIGN KEY (`country`) REFERENCES `countries` (`id`);

--
-- Constraints for table `flightbooking`
--
ALTER TABLE `flightbooking`
  ADD CONSTRAINT `flightBooking_ibfk_1` FOREIGN KEY (`flight`) REFERENCES `flights` (`id`);

--
-- Constraints for table `flights`
--
ALTER TABLE `flights`
  ADD CONSTRAINT `flights_ibfk_2` FOREIGN KEY (`destination`) REFERENCES `airports` (`id`),
  ADD CONSTRAINT `flights_ibfk_1` FOREIGN KEY (`airport`) REFERENCES `airports` (`id`);

--
-- Constraints for table `hotelbooking`
--
ALTER TABLE `hotelbooking`
  ADD CONSTRAINT `hotelBooking_ibfk_1` FOREIGN KEY (`room`) REFERENCES `rooms` (`id`);

--
-- Constraints for table `hotels`
--
ALTER TABLE `hotels`
  ADD CONSTRAINT `hotels_ibfk_1` FOREIGN KEY (`city`) REFERENCES `cities` (`id`);

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`hotel`) REFERENCES `hotels` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
