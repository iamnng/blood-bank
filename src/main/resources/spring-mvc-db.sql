/*
Navicat MySQL Data Transfer

Source Server         : MySQL-Local
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : spring-mvc

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-08-10 02:07:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `donor`
-- ----------------------------
DROP TABLE IF EXISTS `donor`;
CREATE TABLE `donor` (
  `DONOR_NAME` varchar(30) NOT NULL,
  `DONOR_ADDRESS` varchar(50) NOT NULL,
  `BLOOD_GROUP` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`DONOR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of donor
-- ----------------------------
INSERT INTO `donor` VALUES ('Joesph', '221, High Street, Paris', 'B+');
INSERT INTO `donor` VALUES ('Ken', '5, East Square, Amsterdam', 'AB-');
INSERT INTO `donor` VALUES ('Trent', '60, Farrero Avenue, London', 'O+');
