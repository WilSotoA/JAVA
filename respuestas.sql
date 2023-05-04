-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-08-2022 a las 15:30:24
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `encuesta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `Id_respuesta` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Edad` varchar(255) NOT NULL,
  `Sexo` varchar(255) NOT NULL,
  `Codigo` varchar(255) NOT NULL,
  `Deportes_conoce` varchar(255) NOT NULL,
  `Opinion_deportes` text NOT NULL,
  `Deporte_favorito` varchar(255) NOT NULL,
  `Deporte_maspracti` varchar(255) NOT NULL,
  `Deporte_practica` varchar(255) NOT NULL,
  `Dias_practica` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`Id_respuesta`, `Nombre`, `Edad`, `Sexo`, `Codigo`, `Deportes_conoce`, `Opinion_deportes`, `Deporte_favorito`, `Deporte_maspracti`, `Deporte_practica`, `Dias_practica`) VALUES
(1, 'Wilmer', '18', 'Masculino', '1234856', 'Futbol', 'es importante', 'Futbol', 'Futbol', 'Futbol Basquetbol', '2');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`Id_respuesta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `Id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
