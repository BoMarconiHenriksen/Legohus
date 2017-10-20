/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */; -- 0 er true, 1 = false
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE IF NOT EXISTS `legohus`;


USE `legohus`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
  ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
	`orderid` int(11) NOT NULL AUTO_INCREMENT,
    `id` int(45) NOT NULL,
    `length` int(45) NOT NULL,
    `width` int(45) NOT NULL,
    `layers` int(45) NOT NULL,
    `shipped` varchar(45),
    PRIMARY KEY (`orderid`),
    foreign key (id) references user(id)
    )ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee'),
(4, 'test@test.com','test','customer'),
(5, 'admin@admin.com','admin','employee');
UNLOCK TABLES;

INSERT INTO `orderlist` VALUES -- orderid - id - length - width - layers - shipped
(1, 1, 14, 9, 4, '2017-4-4'),
(2, 2, 15, 7, 3, '2017-5-4'),
(3, 4, 19, 9, 5, '2017-3-4'),
(4, 3, 23, 10, 6, '2017-4-4'),
(5, 1, 14, 9, 4, '2017-3-3');
commit;
