-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2017 at 03:41 AM
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

--
-- Dumping data for table `bclothing`
--

INSERT INTO `bclothing` (`pants`, `shirts`, `shoes`, `socks`, `jacket`) VALUES
(3, 5, 15, 7, 10),
(10, 20, 20, 30, 40);

-- --------------------------------------------------------

--
-- Table structure for table `boys`
--

CREATE TABLE `boys` (
  `Name` varchar(10) NOT NULL,
  `Fathers name` varchar(10) NOT NULL,
  `Mothers name` varchar(10) NOT NULL,
  `DOB` varchar(10) NOT NULL,
  `DOJ` varchar(10) NOT NULL,
  `Blood Group` varchar(10) NOT NULL,
  `Weight` float NOT NULL,
  `Height` float NOT NULL,
  `Grade` varchar(10) NOT NULL
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
-- Table structure for table `girls`
--

CREATE TABLE `girls` (
  `Name` varchar(10) NOT NULL,
  `Fathers name` varchar(10) NOT NULL,
  `Mothers name` varchar(10) NOT NULL,
  `DOB` varchar(10) NOT NULL,
  `DOJ` varchar(10) NOT NULL,
  `Blood group` varchar(10) NOT NULL,
  `Weight` float NOT NULL,
  `Height` float NOT NULL,
  `Grade` varchar(10) NOT NULL
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
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `bill` mediumtext NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Contact` int(13) NOT NULL,
  `Comments` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `Requester Name` varchar(50) NOT NULL,
  `Item` varchar(10) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Amount` float NOT NULL,
  `Comments` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`Requester Name`, `Item`, `Quantity`, `Amount`, `Comments`, `status`) VALUES
('Hari', 'shampoo', 50, 500, 'shampoo for boys dorm', 0),
('Veena', 'Toothpaste', 20, 650, 'toothpaste for girls dorm', 0),
('Raju', 'shoes', 2, 1500, 'shoes for ram and shyam', 0),
('Girija', 'toys', 25, 5000, 'toys for girls and boys', 0);

-- --------------------------------------------------------

--
-- Table structure for table `sattend`
--

CREATE TABLE `sattend` (
  `name` varchar(20) NOT NULL,
  `intime` varchar(1000) NOT NULL,
  `outtime` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Name` varchar(10) NOT NULL,
  `Father` varchar(10) NOT NULL,
  `Mother` varchar(10) NOT NULL,
  `doj` date NOT NULL,
  `dob` date NOT NULL,
  `Blood` varchar(10) NOT NULL,
  `Height` float NOT NULL,
  `Weight` int(11) NOT NULL,
  `Grade` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Name`, `Father`, `Mother`, `doj`, `dob`, `Blood`, `Height`, `Weight`, `Grade`) VALUES
('Akul', '-', '-', '2016-06-09', '2010-06-10', 'O+ve', 4.2, 35, ''),
('Manju', '-', '-', '2013-02-21', '2003-04-22', 'AB+ve', 5.5, 53, ''),
('Rahul', 'Ramanna', 'Meera', '2015-02-01', '2008-08-20', 'B+ve', 5.1, 45, ''),
('Rama', '-', '-', '2016-06-09', '2011-06-20', 'O-ve', 4.4, 39, ''),
('Sanjana', '-', '-', '2017-01-24', '0000-00-00', '', 4.4, 50, '5th');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `boys`
--
ALTER TABLE `boys`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `girls`
--
ALTER TABLE `girls`
  ADD PRIMARY KEY (`Name`);

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
