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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-10 23:17:34
