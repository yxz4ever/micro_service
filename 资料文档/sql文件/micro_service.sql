DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `pid` int DEFAULT NULL COMMENT '父ID',
  `name` varchar(10)  NOT NULL COMMENT '部门名称',
  `fullname` varchar(50)  DEFAULT NULL COMMENT '全称',
  `type` varchar(20)  DEFAULT NULL COMMENT '类型',
  `level` tinyint(1) DEFAULT NULL COMMENT '级别',
  `remark` varchar(255)  DEFAULT NULL COMMENT '备注信息',
  `sort_number` int DEFAULT NULL COMMENT '排序字段',
  `create_id` bigint DEFAULT NULL,
  `update_id` bigint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '数据状态 0 正常 1 删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='系统部门表';



DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dept_id` int NOT NULL COMMENT '归属部门ID',
  `username` varchar(20)  NOT NULL COMMENT '用户名',
  `password` varchar(150)  NOT NULL COMMENT '密码',
  `salt` varchar(64)  DEFAULT NULL,
  `avatar_url` text  not null COMMENT '头像',
  `realname` varchar(10)  DEFAULT NULL COMMENT '真实姓名',
  `sex` int DEFAULT NULL COMMENT '性别 0 男 1女',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `email` varchar(30)  DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(15)  DEFAULT NULL COMMENT '手机号',
  `status` tinyint(1) DEFAULT NULL COMMENT '用户状态 0 正常 1禁用',
  `remark` varchar(100)  DEFAULT NULL COMMENT '其他备注',
  `sort_number` int DEFAULT NULL COMMENT '排序',
  `create_id` bigint DEFAULT NULL,
  `update_id` bigint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '数据状态 0 正常 1 删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='系统用户表';