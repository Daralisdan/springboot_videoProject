/*
Navicat MySQL Data Transfer

Source Server         : test_uesrInfo
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : stu

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-08-30 22:18:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(10) NOT NULL,
  `user` varchar(25) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL COMMENT '用户信息表'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
