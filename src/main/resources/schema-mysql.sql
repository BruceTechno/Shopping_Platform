CREATE TABLE IF NOT EXISTS `people` (
  `account` VARCHAR(20) NOT NULL,
  `pwd` VARCHAR(20) NULL,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `active` TINYINT NULL DEFAULT 0,
  `identity` INT NULL DEFAULT 0,
  `order_number` INT NULL DEFAULT 0,
  PRIMARY KEY (`account`));

  CREATE TABLE IF NOT EXISTS `commodity` (
  `number` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `category` VARCHAR(45) NULL,
  `inventory` INT NULL DEFAULT 0,
  `price` INT NULL DEFAULT 0,
  `status` INT NULL DEFAULT 0,
  PRIMARY KEY (`number`));

CREATE TABLE IF NOT EXISTS `order` (
  `order_number` INT NOT NULL,
  `account` VARCHAR(45) NULL,
  `orderInfo` VARCHAR(200) NULL,
  `ordercol` VARCHAR(45) NULL,
  `pay_way` INT NULL,
  `delivery_way` INT NULL,
  PRIMARY KEY (`order_number`));


CREATE TABLE IF NOT EXISTS `shopping_car` (
  `serial_number` INT NOT NULL AUTO_INCREMENT,
  `account` VARCHAR(45) NULL,
  `commodity_number` INT NULL DEFAULT 0,
  `quantity` INT NULL DEFAULT 0,
  PRIMARY KEY (`serial_number`));


CREATE TABLE IF NOT EXISTS `identity_code` (
  `code` INT NOT NULL,
  `identity` VARCHAR(45) NULL,
  PRIMARY KEY (`code`));

CREATE TABLE IF NOT EXISTS `pay_way_code` (
  `code` INT NOT NULL,
  `pay_way` VARCHAR(45) NULL,
  PRIMARY KEY (`code`));

CREATE TABLE IF NOT EXISTS `delivery_way_code` (
  `code` INT NOT NULL,
  `delivery_way` VARCHAR(45) NULL,
  PRIMARY KEY (`code`));


