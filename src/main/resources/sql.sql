DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `registerTime` datetime DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO person(NAME,age,birth,registerTime,salary) VALUES('李四',27,CURRENT_DATE(),NOW(),3000.05);

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO book(name,price) VALUES ("基督山伯爵",11.22),("呼啸山庄",22.12);

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`(
  `oid` int(10) NOT NULL AUTO_INCREMENT,
  `bid` INT(10) ,
  `pid` INT(10) ,
  `saleDate` date DEFAULT NULL ,
  `saleCount` INT(10),
  PRIMARY KEY (oid)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
INSERT INTO `order` (bid, pid, saleDate, saleCount) VALUES (1,1,current_date(),2);