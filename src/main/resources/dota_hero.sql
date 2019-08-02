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

 Date: 02/08/2019 11:54:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dota_hero
-- ----------------------------
DROP TABLE IF EXISTS `dota_hero`;
CREATE TABLE `dota_hero`  (
  `hero_id` bigint(20) NOT NULL,
  `cn_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `en_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `alias` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `head_img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `echelon` int(1) NOT NULL,
  `employment_cost` int(2) NOT NULL,
  `creat_user` bigint(20) NOT NULL,
  PRIMARY KEY (`hero_id`) USING BTREE,
  INDEX `userid`(`creat_user`) USING BTREE,
  CONSTRAINT `userid` FOREIGN KEY (`creat_user`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dota_hero
-- ----------------------------
INSERT INTO `dota_hero` VALUES (1, '变体精灵', 'Morphling', '水人', 'https://www.dota2.com.cn/images/heroes/morphling_hphover.png', 2, 2, 1);
INSERT INTO `dota_hero` VALUES (2, '露娜', 'Luna', '露娜', 'https://www.dota2.com.cn/images/heroes/luna_hphover.png', 2, 2, 1);
INSERT INTO `dota_hero` VALUES (3, '光之守卫', 'Keeper Of The Light', '光法、伊扎洛', 'https://www.dota2.com.cn/images/heroes/keeper_of_the_light_hphover.png', 4, 4, 1);
INSERT INTO `dota_hero` VALUES (4, '巨牙海民', 'Tusk', '海民', 'https://www.dota2.com.cn/images/heroes/tusk_hphover.png', 1, 1, 1);
INSERT INTO `dota_hero` VALUES (5, '帕克', 'Puck', '仙女龙、PUCK', 'https://www.dota2.com.cn/images/heroes/puck_hphover.png', 2, 2, 1);
INSERT INTO `dota_hero` VALUES (6, '巫妖', 'Lich', 'LICH', 'https://www.dota2.com.cn/images/heroes/lich_hphover.png', 5, 5, 1);
INSERT INTO `dota_hero` VALUES (7, '食人魔魔法师', 'Ogre Magi', '蓝胖子', 'https://www.dota2.com.cn/images/heroes/ogre_magi_hphover.png', 1, 1, 1);
INSERT INTO `dota_hero` VALUES (8, '水晶室女', 'Crystal Maiden', '冰女', 'https://www.dota2.com.cn/images/heroes/crystal_maiden_hphover.png', 2, 2, 1);
INSERT INTO `dota_hero` VALUES (9, '风行者', 'Windrunner', '风行，WR', 'https://www.dota2.com.cn/images/heroes/windrunner_hphover.png', 3, 3, 1);
INSERT INTO `dota_hero` VALUES (10, '莉娜', 'Lina', '火女', 'https://www.dota2.com.cn/images/heroes/lina_hphover.png', 3, 3, 1);
INSERT INTO `dota_hero` VALUES (11, '暗影萨满', 'Shadow Shaman', '小Y', 'https://www.dota2.com.cn/images/heroes/shadow_shaman_hphover.png', 1, 1, 1);
INSERT INTO `dota_hero` VALUES (12, '修补匠', 'Tinker', 'TK', 'https://www.dota2.com.cn/images/heroes/tinker_hphover.png', 1, 1, 1);
INSERT INTO `dota_hero` VALUES (13, '先知', 'Furion', 'FUR', 'https://www.dota2.com.cn/images/heroes/furion_hphover.png', 2, 2, 1);
INSERT INTO `dota_hero` VALUES (14, '敌法师', 'Antimage', 'AM、敌法', 'https://www.dota2.com.cn/images/heroes/antimage_hphover.png', 1, 1, 1);
INSERT INTO `dota_hero` VALUES (15, '影魔', 'Nevermore', 'SF', 'https://www.dota2.com.cn/images/heroes/nevermore_hphover.png', 3, 3, 1);
INSERT INTO `dota_hero` VALUES (16, '圣堂刺客', 'Templar Assassin', 'TA，圣堂', 'https://www.dota2.com.cn/images/heroes/templar_assassin_hphover.png', 4, 4, 1);
INSERT INTO `dota_hero` VALUES (17, '矮人直升机', 'Gyrocopter', '飞机', 'https://www.dota2.com.cn/images/heroes/gyrocopter_hphover.png', 5, 5, 1);
INSERT INTO `dota_hero` VALUES (18, '干扰者', 'Disruptor', '萨尔', 'https://www.dota2.com.cn/images/heroes/disruptor_hphover.png', 4, 4, 1);

SET FOREIGN_KEY_CHECKS = 1;
