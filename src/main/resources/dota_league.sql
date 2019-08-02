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

 Date: 02/08/2019 11:54:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dota_league
-- ----------------------------
DROP TABLE IF EXISTS `dota_league`;
CREATE TABLE `dota_league`  (
  `league_id` bigint(20) NOT NULL COMMENT 'id',
  `league_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联盟名称',
  PRIMARY KEY (`league_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dota_league
-- ----------------------------
INSERT INTO `dota_league` VALUES (1, '刺客');
INSERT INTO `dota_league` VALUES (2, '萨满');
INSERT INTO `dota_league` VALUES (3, '太古');
INSERT INTO `dota_league` VALUES (4, '龙族');
INSERT INTO `dota_league` VALUES (5, '法师');
INSERT INTO `dota_league` VALUES (6, '人类');
INSERT INTO `dota_league` VALUES (7, '勇士');
INSERT INTO `dota_league` VALUES (8, '无情');
INSERT INTO `dota_league` VALUES (9, '猎人');
INSERT INTO `dota_league` VALUES (10, '好斗');
INSERT INTO `dota_league` VALUES (11, '鳞甲');
INSERT INTO `dota_league` VALUES (12, '血亲');
INSERT INTO `dota_league` VALUES (13, '野人');
INSERT INTO `dota_league` VALUES (14, '神枪手');
INSERT INTO `dota_league` VALUES (15, '恶魔');
INSERT INTO `dota_league` VALUES (16, '无踪');
INSERT INTO `dota_league` VALUES (17, '巨魔');

SET FOREIGN_KEY_CHECKS = 1;
