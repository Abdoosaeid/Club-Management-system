-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: clup
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `member_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone_no` varchar(20) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `sport_type` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  `payment_status` varchar(20) DEFAULT 'not pay',
  `sport_id` int DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `fk_sport` (`sport_id`),
  CONSTRAINT `fk_sport` FOREIGN KEY (`sport_id`) REFERENCES `sports` (`sport_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6474 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (2435,'yasodufgui','sdgfge','dsfhsdfgh','534534563','2004-09-01',NULL,'Male','2004-03-01','2004-03-01','not pay',1),(3435,'yasodufgui','sdgfge','dsfhsdfgh','534534563','2004-09-01',NULL,'Male','2004-03-01','2004-03-01','not pay',1),(5674,'Ahmed Mahmoud','ahmed@example.com','15 El-Maadi St, Cairo','+20 10 1234 5678','1990-05-15','Football','Male','2022-01-01','2023-01-01','complete',1),(5675,'Fatima Ali','fatima@example.com','22 Sphinx Square, Giza','+20 11 2345 6789','1988-08-22','Swimming','Female','2022-02-15','2023-02-15','half the amount',2),(5676,'Karim Hassan','karim@example.com','7 Nile Corniche, Alexandria','+20 12 3456 7890','1995-11-30','Tennis','Male','2022-03-10','2023-03-10','complete',3),(5677,'Nada Ahmed','nada@example.com','10 El-Borsa St, Luxor','+20 10 9876 5432','1992-07-18','Gym','Female','2022-04-01','2023-04-01','not pay',4),(5678,'Mohamed Salah','mohamed@example.com','5 Aswan Road, Aswan','+20 11 8765 4321','1985-04-05','Football','Male','2022-05-15','2023-05-15','half the amount',1),(5679,'Amira Mohamed','amira@example.com','30 Ramses St, Cairo','+20 10 1111 2222','1993-09-12','Tennis','Female','2023-01-01','2024-01-01','not pay',3),(5680,'Youssef Ahmed','youssef@example.com','45 Tahrir Square, Giza','+20 11 3333 4444','1987-05-18','Swimming','Male','2022-02-15','2023-02-15','complete',2),(5681,'Noura Samir','noura@example.com','20 Corniche El-Nil, Alexandria','+20 12 5555 6666','1998-11-30','Football','Female','2022-03-10','2023-03-10','half the amount',1),(5682,'Ali Gamal','ali@example.com','5 Luxor St, Luxor','+20 10 7777 8888','1990-07-18','Gym','Male','2022-04-01','2023-04-01','complete',4),(5683,'Sara Ibrahim','sara@example.com','15 Aswan Road, Aswan','+20 11 9999 0000','1995-04-05','Football','Female','2022-05-15','2023-05-15','not pay',1),(5684,'Ahmed Hassan','ahmed@example.com','25 Nile Street, Cairo','+20 10 5555 6666','1992-08-20','Swimming','Male','2023-02-01','2024-02-01','complete',2),(5685,'Lina Ali','lina@example.com','40 Sphinx Avenue, Giza','+20 11 7777 8888','1986-04-15','Swimming','Female','2022-07-15','2023-07-15','not pay',2),(5686,'Karim Abdelrahman','karim@example.com','10 Pyramids Road, Cairo','+20 12 9999 0000','1994-11-10','Tennis','Male','2022-03-01','2023-03-01','half the amount',3),(5687,'Sara Khalid','sara@example.com','15 Alexandria Street, Alexandria','+20 10 1111 2222','1989-06-28','Tennis','Female','2022-05-20','2023-05-20','complete',3),(5688,'Mohammed Samir','mohammed@example.com','5 Luxor Street, Luxor','+20 11 3333 4444','1997-02-12','Swimming','Male','2022-09-10','2023-09-10','not pay',2),(5689,'Fatima Ali','fatima@example.com','40 Nile Street, Cairo','+20 10 1234 5678','1994-05-15','Swimming','Female','2023-02-01','2024-02-01','complete',2),(5690,'Ahmed Abdelrahman','ahmed@example.com','55 Sphinx Avenue, Giza','+20 11 2345 6789','1988-07-20','Gym','Male','2022-07-15','2023-07-15','half the amount',4),(5691,'Laila Mohamed','laila@example.com','12 Pyramids Road, Cairo','+20 12 3456 7890','1996-11-10','Tennis','Female','2022-03-01','2023-03-01','complete',3),(5692,'Omar Kamal','omar@example.com','20 Alexandria Street, Alexandria','+20 10 5678 9012','1989-06-28','Gym','Male','2022-05-20','2023-05-20','not pay',4),(5693,'Sara Ahmed','sara@example.com','7 Luxor Street, Luxor','+20 11 7890 1234','1997-02-12','Gym','Female','2022-09-10','2023-09-10','complete',4),(5694,'Omar Ahmed','omar@example.com','30 Nile Street, Cairo','+20 10 1111 2222','1995-09-12','Football','Male','2023-01-01','2024-01-01','not pay',1),(5695,'Nada Ali','nada@example.com','45 Sphinx Avenue, Giza','+20 11 3333 4444','1987-05-18','Football','Female','2022-02-15','2023-02-15','complete',1),(5696,'Khaled Hassan','khaled@example.com','20 Pyramids Road, Cairo','+20 12 5555 6666','1998-11-30','Football','Male','2022-03-10','2023-03-10','half the amount',1),(5697,'Sara Ahmed','sara@example.com','5 Luxor Street, Luxor','+20 10 7777 8888','1990-07-18','Football','Female','2022-04-01','2023-04-01','complete',1),(5698,'Mohamed Samir','mohamed@example.com','15 Alexandria Street, Alexandria','+20 11 9999 0000','1995-04-05','Football','Male','2022-05-15','2023-05-15','not pay',1),(5699,'Lina Mohamed','lina@example.com','30 Nile Street, Cairo','+20 10 1111 2222','1993-09-12','Tennis','Female','2023-01-01','2024-01-01','not pay',3),(5700,'Ahmed Ali','ahmed@example.com','45 Sphinx Avenue, Giza','+20 11 3333 4444','1987-05-18','Gym','Male','2022-02-15','2023-02-15','complete',4),(5701,'Noura Samir','noura@example.com','20 Pyramids Road, Cairo','+20 12 5555 6666','1998-11-30','Tennis','Female','2022-03-10','2023-03-10','half the amount',3),(5702,'Ali Hassan','ali@example.com','5 Luxor Street, Luxor','+20 10 7777 8888','1990-07-18','Tennis','Male','2022-04-01','2023-04-01','complete',3),(5703,'Sara Ibrahim','sara@example.com','15 Alexandria Street, Alexandria','+20 11 9999 0000','1995-04-05','Gym','Female','2022-05-15','2023-05-15','not pay',4),(6453,'abdullah said','abdo@gmail.com','banha-Ahram','+201119063425','2004-09-01',NULL,'Male','2019-03-01','2020-03-01','not pay',1),(6457,'mohmed Ashraf','mohmed@gmail.com','halwan','+201119063245','2004-07-15',NULL,'Male','2004-12-07','2004-12-07','not pay',1),(6473,'Ali mohmed','ali@gmail.com','9_khaled_Elmady','+201501144336','2003-12-13',NULL,'Male','2016-01-13','2023-01-13','not pay',1);
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-25 23:18:20
