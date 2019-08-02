/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3307
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3307
 Source Schema         : guns

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 02/08/2019 11:53:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dota_trammels
-- ----------------------------
DROP TABLE IF EXISTS `dota_trammels`;
CREATE TABLE `dota_trammels`  (
  `trammels_id` bigint(20) NOT NULL COMMENT '主键',
  `trammels_count` int(1) NULL DEFAULT NULL COMMENT '羁绊触发数量',
  `trammels_topic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '羁绊说明',
  `trammels_league_id` bigint(20) NULL DEFAULT NULL COMMENT '所属联盟ID',
  PRIMARY KEY (`trammels_id`) USING BTREE,
  INDEX `所属联盟ID`(`trammels_league_id`) USING BTREE,
  CONSTRAINT `所属联盟ID` FOREIGN KEY (`trammels_league_id`) REFERENCES `dota_league` (`league_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dota_trammels
-- ----------------------------
INSERT INTO `dota_trammels` VALUES (1, 2, '人族单位在攻击时有20%几率使目标沉默4秒', 6);
INSERT INTO `dota_trammels` VALUES (2, 4, '人族单位在攻击时有44%几率使目标沉默4秒', 6);
INSERT INTO `dota_trammels` VALUES (3, 6, '人族单位在攻击时有66%几率使目标沉默4秒', 6);

SET FOREIGN_KEY_CHECKS = 1;
