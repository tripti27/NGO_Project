-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 08, 2017 at 01:24 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jpm`
--

-- --------------------------------------------------------

--
-- Table structure for table `bclothing`
--

CREATE TABLE `bclothing` (
  `pants` int(10) NOT NULL,
  `shirts` int(10) NOT NULL,
  `shoes` int(10) NOT NULL,
  `socks` int(10) NOT NULL,
  `jacket` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bstationaries`
--

CREATE TABLE `bstationaries` (
  `notebooks` int(10) NOT NULL,
  `pencil` int(10) NOT NULL,
  `pen` int(10) NOT NULL,
  `eraser` int(10) NOT NULL,
  `scale` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `btoiletries`
--

CREATE TABLE `btoiletries` (
  `shampoo` int(10) NOT NULL,
  `toothpaste` int(10) NOT NULL,
  `toothbrush` int(10) NOT NULL,
  `soap` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gclothing`
--

CREATE TABLE `gclothing` (
  `pants` int(10) NOT NULL,
  `shirts` int(10) NOT NULL,
  `shoes` int(10) NOT NULL,
  `socks` int(10) NOT NULL,
  `jacket` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `groceries`
--

CREATE TABLE `groceries` (
  `vegetables` int(10) NOT NULL,
  `atta` int(10) NOT NULL,
  `rice` int(10) NOT NULL,
  `jaggery` int(10) NOT NULL,
  `utensils` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gstationaries`
--

CREATE TABLE `gstationaries` (
  `notebooks` int(10) NOT NULL,
  `pencil` int(10) NOT NULL,
  `pen` int(10) NOT NULL,
  `eraser` int(10) NOT NULL,
  `scale` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gtoiletries`
--

CREATE TABLE `gtoiletries` (
  `shampoo` int(10) NOT NULL,
  `toothpaste` int(10) NOT NULL,
  `toothbrush` int(10) NOT NULL,
  `soap` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `house`
--

CREATE TABLE `house` (
  `floor cleaner` int(10) NOT NULL,
  `washing powder` int(10) NOT NULL,
  `broom` int(10) NOT NULL,
  `mug` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login_details`
--

CREATE TABLE `login_details` (
  `id` varchar(15) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` varchar(32) NOT NULL,
  `access_level` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Name` varchar(10) NOT NULL,
  `Father Name` varchar(10) NOT NULL,
  `Mother Name` varchar(10) NOT NULL,
  `Date of Joining` date NOT NULL,
  `Date of Birth` date NOT NULL,
  `Blood Group` varchar(10) NOT NULL,
  `Height` float NOT NULL,
  `Weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login_details`
--
ALTER TABLE `login_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
