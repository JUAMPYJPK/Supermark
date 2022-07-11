-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: supermark
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL,
  `nombre_categoria` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'comestibles'),(2,'lacteos'),(3,'limpieza');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id_producto` int NOT NULL,
  `nombre_producto` varchar(30) DEFAULT NULL,
  `stock_producto` int DEFAULT NULL,
  `precio_unidad` double DEFAULT NULL,
  `vencimiento` varchar(12) DEFAULT NULL,
  `id_categoria` int DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
  KEY `id_categoria` (`id_categoria`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'aceite cocinero',250,200,'2027-12-02',1),(2,'arroz 10 minutos',200,80,'2028-02-12',1),(3,'galletas criollitas',150,60,'2028-03-28',1),(4,'leche costalta',200,120,'2022-09-12',2),(5,'yogurt cosalta',150,140,'2022-09-27',2),(6,'crema de leche sancor',100,200,'2022-10-20',2),(7,'lisoform',140,250,'2029-05-25',3),(8,'jabon liquido skip',90,400,'2029-05-12',3),(9,'lavandina X5',100,100,'2028-06-15',3),(10,'Yerba Marolio',40,150,'2026-06/14',1),(11,'Queso La Paulina',20,950,'2024-05-13',2),(12,'Galletas Rumba',123,140,'2025-05-10',1);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `id_t_usuario` int NOT NULL AUTO_INCREMENT,
  `funcion_usuario` varchar(10) DEFAULT NULL,
  `rol` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_t_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'cliente','usuario externo'),(2,'admin','usuario interno');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(15) DEFAULT NULL,
  `apellido_usuario` varchar(15) DEFAULT NULL,
  `email_usuario` varchar(25) DEFAULT NULL,
  `pass_usuario` varchar(10) DEFAULT NULL,
  `dni_usuario` int DEFAULT NULL,
  `tarjeta_desc` tinyint(1) DEFAULT NULL,
  `cel_usuario` varchar(20) DEFAULT NULL,
  `id_t_usuario` int DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_t_usuario` (`id_t_usuario`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_t_usuario`) REFERENCES `tipo_usuario` (`id_t_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Jose','Lopez','jlopez@gmail.com','jose123',22452587,1,'387455145',1),(2,'Joana','Juarez','jjuarez@gmail.com','j123',12457857,1,'3875664457',1),(3,'Guido','Escalante','ge@gmail.com','12345',25451124,1,'3875641214',1),(4,'Vanesa','Duran','vduran@gmai.com','45678',25451547,1,'3875441887',1),(5,'Frida','Amaya','fa@gmail.com','frida123',40125542,1,'3874350692',1),(6,'Juan','Gaita','jpgaita@gmail.com','juampy',30637941,0,'3874136211',2),(7,'Joaco','Ponce','jpo@gmail.com','123456',12547785,1,'154785541',1),(8,'Ricardo','Laime','rl@gmail.com','r123',14587785,1,'154785547',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `id_venta` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int DEFAULT NULL,
  `fecha` varchar(20) DEFAULT NULL,
  `detalle` varchar(250) DEFAULT NULL,
  `monto_venta` double DEFAULT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,1,'2008','varios productos',560),(2,2,'2007','detalle producto',460),(3,3,'1987','detalles varios',350),(4,4,'2023/07/08','varios productos',560),(5,5,'2023/07/09','detalle producto',460),(6,7,'2023/06/30','detalles varios',350),(7,1,'2023-07-08','varios productos',560),(8,2,'2023-07-09','detalle producto',460),(9,3,'2023-06-30','detalles varios',350),(10,5,'2022-6-10','Producto [id_producto=12, nombre_p=Galletas Rumba, stock=3, precio=140.0, vencimiento=2025-05-10, id_categoria=1]\n',420),(11,5,'2022-6-10','Producto [id_producto=12, nombre_p=Galletas Rumba, stock=2, precio=140.0, vencimiento=2025-05-10, id_categoria=1]\n',280);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-10 23:14:32
