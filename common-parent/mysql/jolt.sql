CREATE TABLE `user` (
`user_id` int(32) NOT NULL COMMENT '学号',
`password` varchar(255) NOT NULL COMMENT '密码',
`user_class` int(32) NOT NULL COMMENT '班级号',
`power_title` int(32) NOT NULL COMMENT '权限号',
PRIMARY KEY (`user_id`) ,
INDEX (`user_class` ASC) USING BTREE
);

CREATE TABLE `class` (
`class_user` int(32) NOT NULL AUTO_INCREMENT COMMENT '班级号',
`class_age` varchar(255) NOT NULL COMMENT '年级',
`class_major` varchar(255) NOT NULL COMMENT '专业',
PRIMARY KEY (`class_user`) 
);

CREATE TABLE `title` (
`title_power` int(32) NOT NULL COMMENT '权限',
`title` varchar(255) NOT NULL COMMENT '页面title',
`title_id` varchar(255) NULL COMMENT 'title的标识',
PRIMARY KEY (`title_power`) 
);

CREATE TABLE `record` (
`record_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
`user_id` int(32) NOT NULL COMMENT '用户ID',
`exercises_id` int(32) NOT NULL COMMENT '题号ID',
`done` text NOT NULL COMMENT '已做答案',
`answer` text NOT NULL COMMENT '正确答案',
`subtime` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`record_id`) ,
INDEX (`user_id` ASC) USING BTREE
);

CREATE TABLE `examination_records` (
`examination_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '卷子ID',
`user_id` int(32) NOT NULL COMMENT '用户ID',
`choice` varchar(255) NOT NULL COMMENT '选择题JSON',
`choice_done` varchar(255) NULL COMMENT '选择题答案',
`completion` varchar(255) NOT NULL COMMENT '填空题JSON',
`completion_done` varchar(255) NULL COMMENT '填空题答案',
`score` int(32) NULL,
PRIMARY KEY (`examination_id`) ,
INDEX (`user_id` ASC) USING BTREE
);

CREATE TABLE `library` (
`problem_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '题库名称',
`introduce` varchar(255) NULL COMMENT '题库信息',
PRIMARY KEY (`problem_id`) 
);

CREATE TABLE `choice` (
`choice_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '选择题ID',
`problem_id` int(32) NULL COMMENT '题库ID',
`introduce` text NULL COMMENT '介绍',
`A` text NULL,
`B` text NULL,
`C` text NULL,
`D` text NULL,
`answer` varchar(32) NULL,
`score` int(32) NULL,
PRIMARY KEY (`choice_id`) ,
INDEX (`problem_id` ASC) USING BTREE
);

CREATE TABLE `completion` (
`completion_id` int(32) NOT NULL AUTO_INCREMENT,
`problem_id` int(32) NULL,
`introduce` text NULL,
`answer` text NULL,
`score` int(32) NULL,
PRIMARY KEY (`completion_id`) ,
INDEX (`problem_id` ASC) USING BTREE
);


ALTER TABLE `class` ADD CONSTRAINT `class_user` FOREIGN KEY (`class_user`) REFERENCES `user` (`user_class`) ON DELETE CASCADE;
ALTER TABLE `user` ADD CONSTRAINT `power_title` FOREIGN KEY (`power_title`) REFERENCES `title` (`title_power`);
ALTER TABLE `user` ADD CONSTRAINT `user_record` FOREIGN KEY (`user_id`) REFERENCES `record` (`user_id`) ON DELETE CASCADE;
ALTER TABLE `user` ADD CONSTRAINT `user_examination` FOREIGN KEY (`user_id`) REFERENCES `examination_records` (`user_id`) ON DELETE CASCADE;
ALTER TABLE `library` ADD CONSTRAINT `choice` FOREIGN KEY (`problem_id`) REFERENCES `choice` (`problem_id`) ON DELETE CASCADE;
ALTER TABLE `library` ADD CONSTRAINT `completion` FOREIGN KEY (`problem_id`) REFERENCES `completion` (`problem_id`) ON DELETE CASCADE;

