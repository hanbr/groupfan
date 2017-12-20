/*
SQLyog Ultimate v8.32 
MySQL - 5.6.17 : Database - groupfandb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`groupfandb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `groupfandb`;

/*Table structure for table `t_banner` */

DROP TABLE IF EXISTS `t_banner`;

CREATE TABLE `t_banner` (
  `banner_id` bigint(20) NOT NULL,
  `image_url` varchar(100) DEFAULT NULL COMMENT '图片路径',
  `image_link` varchar(100) DEFAULT NULL COMMENT '链接地址',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `status` char(1) DEFAULT '1' COMMENT '状态 默认1,0无效，1有效',
  `created_date` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_banner` */

/*Table structure for table `t_goods` */

DROP TABLE IF EXISTS `t_goods`;

CREATE TABLE `t_goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `goods_desc` text COLLATE utf8_unicode_ci COMMENT '商品描述',
  `goods_kind` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品规格，JSON格式\n[{“kindName”:”名称”,”price”:100,”count”:100},{...}]',
  `price` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '价格范围',
  `is_release` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '是否上架，0未上架，1已上架，默认1',
  `release_date` datetime DEFAULT NULL COMMENT '发布时间',
  `freight` double DEFAULT NULL COMMENT '运费，0为包邮',
  `user_id` bigint(20) DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品地址',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '状态，默认1, 0无效 1有效',
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_goods` */

insert  into `t_goods`(`goods_id`,`goods_name`,`goods_desc`,`goods_kind`,`price`,`is_release`,`release_date`,`freight`,`user_id`,`address`,`status`,`created_date`,`updated_date`) values (1,'法兰绒 褥子 床垫','法兰绒床褥子垫背床铺垫子薄款铺床被垫褥1.5米1.8m珊瑚绒床垫1.2】[厂家直营]：买退无忧 商家承诺：免费提供“运费险”，退货最高获赔25元运费理赔','[{\"kindName\":\"0.9*2.0cm\",\"price\":39,\"count\":100},{\"kindName\":\"1.0*2.0cm\",\"price\":49,\"count\":100}]','39-49','1','2017-12-19 14:21:29',NULL,1,'北京市 海淀区','1','2017-12-19 14:21:29','2017-12-19 14:21:29'),(2,'男士皮鞋韩版系带潮鞋休闲鞋冬季男鞋加绒保暖英伦百搭鞋子内增高','品牌名称：XUSBEAN/旭宾\n产品参数：\n上市年份季节: 2017年秋季货号: 082305销售渠道类型: 纯电商(只在线上销售)鞋垫材质: PU鞋跟高: 低跟(1-3cm)品牌: XUSBEAN/旭宾鞋头款式: 圆头闭合方式: 系带鞋底材质: TPR(牛筋）鞋面材质: 超纤真','[{\"kindName\":\"40\",\"price\":119,\"count\":100},{\"kindName\":\"41\",\"price\":119,\"count\":100},{\"kindName\":\"42\",\"price\":119,\"count\":100},{\"kindName\":\"43\",\"price\":129,\"count\":100}]','119.0-129.0','1','2017-12-19 16:43:42',NULL,1,'北京市 海淀区','1','2017-12-19 16:43:41','2017-12-19 16:43:41');

/*Table structure for table `t_goods_group` */

DROP TABLE IF EXISTS `t_goods_group`;

CREATE TABLE `t_goods_group` (
  `goods_id` bigint(20) NOT NULL,
  `group_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_goods_group` */

/*Table structure for table `t_goods_photo` */

DROP TABLE IF EXISTS `t_goods_photo`;

CREATE TABLE `t_goods_photo` (
  `photo_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品标识',
  `photo_url` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片路径',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户标识',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '状态 默认1,0无效，1有效',
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`photo_id`),
  KEY `FK_t_goods_img` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_goods_photo` */

insert  into `t_goods_photo`(`photo_id`,`goods_id`,`photo_url`,`user_id`,`sort`,`status`,`created_date`,`updated_date`) values (1,1,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.87f9940c978c375f355e1fa6e2e329f8.jpg',NULL,1,NULL,NULL,NULL),(2,1,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.539e5d3030f6240614209e34cc6ac8bb.jpg',NULL,2,NULL,NULL,NULL),(3,1,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.1834c13a5e577605411e87feaf95bcdc.jpg',NULL,3,NULL,NULL,NULL),(4,2,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.522ed06ea51c467d934e9715a32222c2.jpg',NULL,1,NULL,NULL,NULL),(5,2,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.f160005d5e35ab751f5a9e87c0b54207.jpg',NULL,2,NULL,NULL,NULL),(6,2,'http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.fd5225e387d3889941b6aeea3daf013d.jpg',NULL,3,NULL,NULL,NULL);

/*Table structure for table `t_message` */

DROP TABLE IF EXISTS `t_message`;

CREATE TABLE `t_message` (
  `msg_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_id` bigint(20) DEFAULT NULL COMMENT '商品标识',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品标识，可为空',
  `send_user` bigint(20) DEFAULT NULL COMMENT '发送用户标识',
  `sale_user` bigint(20) DEFAULT NULL COMMENT '接收用户标识',
  `content` varchar(400) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '消息内容',
  `type` char(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '消息类型，1系统消息，2普通消息',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态 默认1,0无效，1有效',
  `send_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发送时间',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_message` */

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `order_no` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '订单号',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品标识',
  `order_remark` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `total_price` double DEFAULT NULL COMMENT '商品总额',
  `pay_type` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '支付方式，默认1，微信支付， 2银联支付',
  `release_time` datetime DEFAULT NULL COMMENT '发布时间',
  `goods_kind` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '下单时间',
  `pay_time` datetime DEFAULT NULL COMMENT '付款时间',
  `deal_time` datetime DEFAULT NULL COMMENT '成交时间',
  `buy_user` bigint(20) DEFAULT NULL COMMENT '买家',
  `sale_user` bigint(20) DEFAULT NULL COMMENT '卖家',
  `addr_id` bigint(20) DEFAULT NULL COMMENT '送货地址',
  `goods_name` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `goods_desc` text COLLATE utf8_unicode_ci,
  `address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '订单状态，0取消，1待支付，2支付成功， 3运输中，4交易结束，5退货',
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_order` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `wechat_openid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '官方用户微信openid',
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
  `user_head` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户头像',
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '微信地址',
  `sex` char(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '性别 1男 2女',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '状态 ，默认1 ，0无效 1有效',
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_user` */

insert  into `t_user`(`user_id`,`wechat_openid`,`user_name`,`user_head`,`address`,`sex`,`status`,`created_date`,`updated_date`) values (1,'adminopenid','admin',NULL,'北京市海淀区','男','1','2017-12-19 15:34:15','2017-12-19 15:34:15');

/*Table structure for table `t_user_address` */

DROP TABLE IF EXISTS `t_user_address`;

CREATE TABLE `t_user_address` (
  `address_id` bigint(20) NOT NULL COMMENT 'id主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '与用户表关联的id',
  `consignee` varchar(50) DEFAULT NULL COMMENT '收货人姓名',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系方式',
  `code` varchar(20) DEFAULT NULL COMMENT '邮编',
  `country` varchar(45) DEFAULT NULL COMMENT '国家',
  `province` varchar(45) DEFAULT NULL COMMENT '省',
  `city` varchar(45) DEFAULT NULL COMMENT '市',
  `distric` varchar(45) DEFAULT NULL COMMENT '区',
  `detailed_address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `selected` char(1) DEFAULT NULL COMMENT '是否是默认地址，1--是',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `status` char(1) DEFAULT NULL COMMENT '状态:1--有效,2--无效',
  `cteated_date` datetime DEFAULT NULL COMMENT '添加时间',
  `updated_date` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户地址表';

/*Data for the table `t_user_address` */

/*Table structure for table `t_user_collect` */

DROP TABLE IF EXISTS `t_user_collect`;

CREATE TABLE `t_user_collect` (
  `collect_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_Id` bigint(20) DEFAULT NULL COMMENT '用户标识',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品标识',
  `status` char(1) DEFAULT NULL COMMENT '状态 ，默认1 ，0无效 1有效',
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`collect_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_user_collect` */

/*Table structure for table `t_user_group` */

DROP TABLE IF EXISTS `t_user_group`;

CREATE TABLE `t_user_group` (
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户标示',
  `group_id` bigint(20) DEFAULT NULL COMMENT '群标示',
  `wechat_openid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '官方用户openid',
  `wechat_opengid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '官方微信群openGId',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态:1--有效,2--无效''',
  `created_date` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_date` datetime DEFAULT NULL COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_user_group` */

/*Table structure for table `t_wechat_group` */

DROP TABLE IF EXISTS `t_wechat_group`;

CREATE TABLE `t_wechat_group` (
  `group_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '群标识',
  `wechat_opengid` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '微信群的唯一标识',
  `group_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '群名称',
  `status` char(1) COLLATE utf8_unicode_ci DEFAULT '1' COMMENT '状态，默认1,0无效 1有效',
  `created_date` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_wechat_group` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
