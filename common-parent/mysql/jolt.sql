/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : jolt

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 12/07/2019 18:30:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for choice
-- ----------------------------
DROP TABLE IF EXISTS `choice`;
CREATE TABLE `choice`  (
  `choice_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '选择题ID',
  `problem_id` int(32) DEFAULT NULL COMMENT '题库ID',
  `introduce` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '介绍',
  `a` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `b` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `c` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `d` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`choice_id`) USING BTREE,
  INDEX `problem_id`(`problem_id`) USING BTREE,
  CONSTRAINT `choice_ibfk_1` FOREIGN KEY (`problem_id`) REFERENCES `library` (`problem_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of choice
-- ----------------------------
INSERT INTO `choice` VALUES (1, 1, 'Java语言中下面哪个可以用作正确的变量名称（ ）', '3D', 'name', 'String', 'int', 'b');
INSERT INTO `choice` VALUES (3, 1, 'Java源文件和编译后的文件扩展名分别为（ ）', '.class和 .java ', '.java和 .class', '.class和 .class ', '.java和 .java ', 'b');
INSERT INTO `choice` VALUES (4, 1, '在Java中，不属于整数类型变量的是( ) ', 'double', 'long ', 'int', 'byte ', 'a');
INSERT INTO `choice` VALUES (8, 1, '下列哪项不属于Java语言的基本数据类型？', 'int', 'String', 'double', 'boolean', 'b');
INSERT INTO `choice` VALUES (9, 1, '下列哪项不是int类型的字面量？', '\\u03A6', '077', 'OxABBC', '20', 'a');
INSERT INTO `choice` VALUES (10, 1, '下列哪项不是有效的标识符？', 'userName', '2test', '$change', '_password', 'b');
INSERT INTO `choice` VALUES (11, 1, '基本数据类型float的包裹类是哪项？\r\n', 'Integer', 'Double', 'Float', 'Character', 'c');
INSERT INTO `choice` VALUES (12, 1, 'JAVA所定义的版本中不包括：（）', ' JAVA2 EE', 'JAVA2 Card', 'JAVA2 ME', 'JAVA2 HE', 'd');
INSERT INTO `choice` VALUES (13, 1, '下列说法正确的是（）', 'JAVA程序的main方法必须写在类里面', 'JAVA程序中可以有多个main方法', ' JAVA程序中类名必须与文件名一样', 'JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来', 'a');
INSERT INTO `choice` VALUES (14, 1, '变量命名规范说法正确的是（）', '变量由字母、下划线、数字、$符号随意组成；', '变量不能以数字作为开头；', ' A和a在java中是同一个变量；', '不同类型的变量，可以起相同的名字；', 'b');
INSERT INTO `choice` VALUES (15, 1, '下列javaDoc注释正确的是（）', '/*我爱北京天安门*/', ' //我爱北京天安门*/', '/**我爱北京天安门*/', '/*我爱北京天安门**/', 'c');
INSERT INTO `choice` VALUES (16, 1, '为一个boolean类型变量赋值时，可以使用()方式', 'boolean = 1;', 'boolean a = (9 >= 10);', 'boolean a=\"真\";', 'boolean a = = false;', 'b');
INSERT INTO `choice` VALUES (17, 1, '以下()不是合法的标识符', 'STRING', 'x3x;', ' void', 'de$f', 'c');
INSERT INTO `choice` VALUES (18, 1, '下列值不为true的表达式有。', '\"john\" = = \"john\"', '\"john\".equals(\"john\")', ' \"john\" = \"john\"', '\"john\".equals(new String(\"john\"))', 'c');
INSERT INTO `choice` VALUES (19, 1, '对象的特征在类中表示为变量，称为类的（）。', '对象', ' 属性', '方法', '数据类型', 'b');
INSERT INTO `choice` VALUES (20, 1, '在java中下列关于自动类型转换说法正确的是（）', '基本数据类型和String相加结果一定是字符串型', 'char类型和int类型相加结果一定是字符', 'double类型可以自动转换为int', 'char + int + double +\"\" 结果一定是double；', 'a');
INSERT INTO `choice` VALUES (23, 2, 'a', 'a', 'a', 'a', 'a', 'a');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `class_user` int(32) NOT NULL AUTO_INCREMENT COMMENT '班级号',
  `class_age` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '年级',
  `class_major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '专业',
  PRIMARY KEY (`class_user`) USING BTREE,
  INDEX `class_user`(`class_user`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (0, '17级', '超级管理');
INSERT INTO `class` VALUES (25, '17级', '软件开发（三班）');

-- ----------------------------
-- Table structure for completion
-- ----------------------------
DROP TABLE IF EXISTS `completion`;
CREATE TABLE `completion`  (
  `completion_id` int(32) NOT NULL AUTO_INCREMENT,
  `problem_id` int(32) DEFAULT NULL,
  `subject` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `introduce` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `answer` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  PRIMARY KEY (`completion_id`) USING BTREE,
  INDEX `problem_id`(`problem_id`) USING BTREE,
  CONSTRAINT `completion_ibfk_1` FOREIGN KEY (`problem_id`) REFERENCES `library` (`problem_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of completion
-- ----------------------------
INSERT INTO `completion` VALUES (1, 1, '第一个Java程序 ，输出到控制台打印字符串 Hello World', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n       ____________________________________\r\n    }\r\n}', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n        System.out.println(\"Hello World\");\r\n    }\r\n}');
INSERT INTO `completion` VALUES (13, 1, '已知a,b均是整型变量，写出将x,y两个变量中的值互换', 'public class Test01{\r\n\r\n   public static void main(String [] args){\r\n\r\n      int x=2;\r\n\r\n      int y=3;\r\n\r\n      int temp=_____;\r\n\r\n      x=______;\r\n\r\n      ______=temp;\r\n\r\n      System.out.println(x+\",\"+\"y\");\r\n\r\n   }\r\n\r\n}\r\n', 'public class Test01{\r\n\r\n   public static void main(String [] args){\r\n\r\n      int x=2;\r\n\r\n      int y=3;\r\n\r\n      int temp=x;\r\n\r\n      x=y;\r\n\r\n      y=temp;\r\n\r\n      System.out.println(x+\",\"+\"y\");\r\n\r\n   }\r\n\r\n}');
INSERT INTO `completion` VALUES (14, 1, 'Int型数字转换成String', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n          nt num1=123456;\r\n          String str2=String._______(num1);    \r\n          System.out.println(str2);\r\n    }\r\n}', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n       char c=\'3\';\r\n       System.out.println(c-\'0\'); \r\n    }\r\n}');
INSERT INTO `completion` VALUES (15, 1, 'String转换成Int型数字', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n         String str3=new String(\"9876543\");\r\n         int num2=Integer._______(str3);\r\n         System.out.println(num1+num2);\r\n    }\r\n}', 'public class HelloWorld {\r\n    public static void main(String []args) {\r\n         String str3=new String(\"9876543\");\r\n         int num2=Integer.parseInt(str3);\r\n         System.out.println(num1+num2);\r\n    }\r\n}');
INSERT INTO `completion` VALUES (16, 1, '请利用用自增，自减算术符补全一下代码得到以下输出结果：\r\n++++2\r\n----2\r\n\r\n', 'public class ZiZeng {\r\n    public static void main(String[] args) {\r\n        int i=1; \r\n        i = ++i;\r\n        System.out.println(\"----\" + i);\r\n        i = _____;\r\n        System.out.println(\"****\" + i);\r\n        \r\n    }\r\n}', 'public class ZiZeng {\r\n    public static void main(String[] args) {\r\n        int i=1; \r\n        i = ++i;\r\n        System.out.println(\"----\" + i);\r\n        i = i++;\r\n        System.out.println(\"****\" + i);\r\n        \r\n    }\r\n}');

-- ----------------------------
-- Table structure for examination_records
-- ----------------------------
DROP TABLE IF EXISTS `examination_records`;
CREATE TABLE `examination_records`  (
  `examination_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '卷子ID',
  `user_id` int(32) NOT NULL COMMENT '用户ID',
  `choice` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '选择题JSON',
  `choice_done` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '选择题答案',
  `completion` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '填空题JSON',
  `completion_done` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '填空题答案',
  `score` int(32) DEFAULT NULL,
  `problem_id` int(32) DEFAULT NULL,
  `timer` timestamp(0) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`examination_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `examination_records_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examination_records
-- ----------------------------
INSERT INTO `examination_records` VALUES (12, 1730402061, NULL, '[{\"choice_id\":15,\"problem_id\":1,\"introduce\":\"下列javaDoc注释正确的是（）\",\"a\":\"/*我爱北京天安门*/\",\"b\":\" //我爱北京天安门*/\",\"c\":\"/**我爱北京天安门*/\",\"d\":\"/*我爱北京天安门**/\",\"answer\":\"c\",\"timer\":null},{\"choice_id\":14,\"problem_id\":1,\"introduce\":\"变量命名规范说法正确的是（）\",\"a\":\"变量由字母、下划线、数字、$符号随意组成；\",\"b\":\"变量不能以数字作为开头；\",\"c\":\" A和a在java中是同一个变量；\",\"d\":\"不同类型的变量，可以起相同的名字；\",\"answer\":\"b\",\"timer\":null},{\"choice_id\":18,\"problem_id\":1,\"introduce\":\"下列值不为true的表达式有。\",\"a\":\"\\\"john\\\" = = \\\"john\\\"\",\"b\":\"\\\"john\\\".equals(\\\"john\\\")\",\"c\":\" \\\"john\\\" = \\\"john\\\"\",\"d\":\"\\\"john\\\".equals(new String(\\\"john\\\"))\",\"answer\":\"c\",\"timer\":null},{\"choice_id\":12,\"problem_id\":1,\"introduce\":\"JAVA所定义的版本中不包括：（）\",\"a\":\" JAVA2 EE\",\"b\":\"JAVA2 Card\",\"c\":\"JAVA2 ME\",\"d\":\"JAVA2 HE\",\"answer\":\"d\",\"timer\":null},{\"choice_id\":10,\"problem_id\":1,\"introduce\":\"下列哪项不是有效的标识符？\",\"a\":\"userName\",\"b\":\"2test\",\"c\":\"$change\",\"d\":\"_password\",\"answer\":\"b\",\"timer\":null},{\"choice_id\":9,\"problem_id\":1,\"introduce\":\"下列哪项不是int类型的字面量？\",\"a\":\"\\\\u03A6\",\"b\":\"077\",\"c\":\"OxABBC\",\"d\":\"20\",\"answer\":\"a\",\"timer\":null},{\"choice_id\":1,\"problem_id\":1,\"introduce\":\"Java语言中下面哪个可以用作正确的变量名称（ ）\",\"a\":\"3D\",\"b\":\"name\",\"c\":\"String\",\"d\":\"int\",\"answer\":\"b\",\"timer\":null},{\"choice_id\":11,\"problem_id\":1,\"introduce\":\"基本数据类型float的包裹类是哪项？\\r\\n\",\"a\":\"Integer\",\"b\":\"Double\",\"c\":\"Float\",\"d\":\"Character\",\"answer\":\"c\",\"timer\":null},{\"choice_id\":16,\"problem_id\":1,\"introduce\":\"为一个boolean类型变量赋值时，可以使用()方式\",\"a\":\"boolean = 1;\",\"b\":\"boolean a = (9 >= 10);\",\"c\":\"boolean a=\\\"真\\\";\",\"d\":\"boolean a = = false;\",\"answer\":\"b\",\"timer\":null},{\"choice_id\":19,\"problem_id\":1,\"introduce\":\"对象的特征在类中表示为变量，称为类的（）。\",\"a\":\"对象\",\"b\":\" 属性\",\"c\":\"方法\",\"d\":\"数据类型\",\"answer\":\"b\",\"timer\":null}]', NULL, '[{\"completion_id\":15,\"problem_id\":1,\"introduce\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n         String str3=new String(\\\"9876543\\\");\\r\\n         int num2=Integer._______(str3);\\r\\n         System.out.println(num1+num2);\\r\\n    }\\r\\n}\",\"subject\":\"String转换成Int型数字\",\"answer\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n         String str3=new String(\\\"9876543\\\");\\r\\n         int num2=Integer.parseInt(str3);\\r\\n         System.out.println(num1+num2);\\r\\n    }\\r\\n}\",\"score\":null,\"timer\":null},{\"completion_id\":14,\"problem_id\":1,\"introduce\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n          nt num1=123456;\\r\\n          String str2=String._______(num1);    \\r\\n          System.out.println(str2);\\r\\n    }\\r\\n}\",\"subject\":\"Int型数字转换成String\",\"answer\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n       char c=\'3\';\\r\\n       System.out.println(c-\'0\'); \\r\\n    }\\r\\n}\",\"score\":null,\"timer\":null},{\"completion_id\":16,\"problem_id\":1,\"introduce\":\"public class ZiZeng {\\r\\n    public static void main(String[] args) {\\r\\n        int i=1; \\r\\n        i = ++i;\\r\\n        System.out.println(\\\"----\\\" + i);\\r\\n        i = _____;\\r\\n        System.out.println(\\\"****\\\" + i);\\r\\n        \\r\\n    }\\r\\n}\",\"subject\":\"请利用用自增，自减算术符补全一下代码得到以下输出结果：\\r\\n++++2\\r\\n----2\\r\\n\\r\\n\",\"answer\":\"public class ZiZeng {\\r\\n    public static void main(String[] args) {\\r\\n        int i=1; \\r\\n        i = ++i;\\r\\n        System.out.println(\\\"----\\\" + i);\\r\\n        i = i++;\\r\\n        System.out.println(\\\"****\\\" + i);\\r\\n        \\r\\n    }\\r\\n}\",\"score\":null,\"timer\":null},{\"completion_id\":1,\"problem_id\":1,\"introduce\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n       ____________________________________\\r\\n    }\\r\\n}\",\"subject\":\"第一个Java程序 ，输出到控制台打印字符串 Hello World\",\"answer\":\"public class HelloWorld {\\r\\n    public static void main(String []args) {\\r\\n        System.out.println(\\\"Hello World\\\");\\r\\n    }\\r\\n}\",\"score\":null,\"timer\":null},{\"completion_id\":13,\"problem_id\":1,\"introduce\":\"public class Test01{\\r\\n\\r\\n   public static void main(String [] args){\\r\\n\\r\\n      int x=2;\\r\\n\\r\\n      int y=3;\\r\\n\\r\\n      int temp=_____;\\r\\n\\r\\n      x=______;\\r\\n\\r\\n      ______=temp;\\r\\n\\r\\n      System.out.println(x+\\\",\\\"+\\\"y\\\");\\r\\n\\r\\n   }\\r\\n\\r\\n}\\r\\n\",\"subject\":\"已知a,b均是整型变量，写出将x,y两个变量中的值互换\",\"answer\":\"public class Test01{\\r\\n\\r\\n   public static void main(String [] args){\\r\\n\\r\\n      int x=2;\\r\\n\\r\\n      int y=3;\\r\\n\\r\\n      int temp=x;\\r\\n\\r\\n      x=y;\\r\\n\\r\\n      y=temp;\\r\\n\\r\\n      System.out.println(x+\\\",\\\"+\\\"y\\\");\\r\\n\\r\\n   }\\r\\n\\r\\n}\",\"score\":null,\"timer\":null}]', NULL, 1, NULL);

-- ----------------------------
-- Table structure for library
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library`  (
  `problem_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '题库名称',
  `introduce` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '题库信息',
  `off` int(32) DEFAULT NULL COMMENT '开启考试',
  PRIMARY KEY (`problem_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of library
-- ----------------------------
INSERT INTO `library` VALUES (1, '变量，数据类型与运算符', 1);
INSERT INTO `library` VALUES (2, 'fasd ', 0);

-- ----------------------------
-- Table structure for records
-- ----------------------------
DROP TABLE IF EXISTS `records`;
CREATE TABLE `records`  (
  `records_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` int(32) DEFAULT NULL,
  `librart_id` int(32) DEFAULT NULL,
  `timer` timestamp(0) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `c_id` int(32) DEFAULT NULL,
  PRIMARY KEY (`records_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `records_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of records
-- ----------------------------
INSERT INTO `records` VALUES (1, 1730402061, 1, '2019-07-10 14:15:43', 1);
INSERT INTO `records` VALUES (4, 1730402066, 1, '2019-07-10 15:08:26', 3);

-- ----------------------------
-- Table structure for title
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `title_power` int(32) NOT NULL COMMENT '权限',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '页面title',
  `title_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'title的标识',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `title_power`(`title_power`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES (1, 0, '个人信息', 'information');
INSERT INTO `title` VALUES (2, 1, '个人信息', 'information');
INSERT INTO `title` VALUES (3, 1, '试题分类', 'classification');
INSERT INTO `title` VALUES (4, 1, '练习记录', 'record');
INSERT INTO `title` VALUES (5, 1, '排行榜', 'rankingList');
INSERT INTO `title` VALUES (7, 1, '在线测试', 'onlineTesting');
INSERT INTO `title` VALUES (8, 0, '学生操作', 'studentAdd');
INSERT INTO `title` VALUES (9, 0, '学生信息', 'studentInformation');
INSERT INTO `title` VALUES (10, 0, '试题操作', 'questionsAdd');
INSERT INTO `title` VALUES (11, 0, '试题信息', 'questionsInformation');
INSERT INTO `title` VALUES (12, 0, '学生成绩', 'achievement');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` int(32) NOT NULL COMMENT '学号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '性别',
  `user_class` int(32) NOT NULL COMMENT '班级号',
  `power_title` int(32) NOT NULL COMMENT '权限号',
  PRIMARY KEY (`id`, `user_id`) USING BTREE,
  INDEX `user_class`(`user_class`) USING BTREE,
  INDEX `power_title`(`power_title`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_class`) REFERENCES `class` (`class_user`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`power_title`) REFERENCES `title` (`title_power`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 153 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 62621878, '123456', '测试（Test）', '男', 0, 0);
INSERT INTO `user` VALUES (109, 1730402061, '123456', '王泽宇', '男', 25, 1);
INSERT INTO `user` VALUES (110, 1730402066, '123456', '张啸', '女', 25, 1);
INSERT INTO `user` VALUES (111, 1730402070, '123456', '李亚蒙', '女', 25, 1);
INSERT INTO `user` VALUES (112, 1730402075, '123456', '陆振达', '男', 25, 1);
INSERT INTO `user` VALUES (113, 1730402079, '123456', '刘婷婷', '女', 25, 1);
INSERT INTO `user` VALUES (114, 1730402081, '123456', '张振轩', '男', 25, 1);
INSERT INTO `user` VALUES (115, 1730402085, '123456', '郭帅欣', '男', 25, 1);
INSERT INTO `user` VALUES (116, 1730402094, '123456', '王盼盼', '女', 25, 1);
INSERT INTO `user` VALUES (117, 1730402096, '123456', '陈振飞', '男', 25, 1);
INSERT INTO `user` VALUES (118, 1730402105, '123456', '李兴宏', '男', 25, 1);
INSERT INTO `user` VALUES (119, 1730402113, '123456', '何宇飞', '男', 25, 1);
INSERT INTO `user` VALUES (120, 1730402117, '123456', '巩孝赞', '男', 25, 1);
INSERT INTO `user` VALUES (121, 1730402121, '123456', '于海', '男', 25, 1);
INSERT INTO `user` VALUES (122, 1730402125, '123456', '孙光耀', '男', 25, 1);
INSERT INTO `user` VALUES (123, 1730402130, '123456', '李贺', '男', 25, 1);
INSERT INTO `user` VALUES (124, 1730402134, '123456', '孙传超', '男', 25, 1);
INSERT INTO `user` VALUES (125, 1730405003, '123456', '冯玉强', '男', 25, 1);
INSERT INTO `user` VALUES (126, 1730405007, '123456', '李呈阳', '男', 25, 1);
INSERT INTO `user` VALUES (127, 1730405013, '123456', '肖亚楠', '男', 25, 1);
INSERT INTO `user` VALUES (128, 1730405016, '123456', '张亚楠', '女', 25, 1);
INSERT INTO `user` VALUES (129, 1730405019, '123456', '郝永哲', '男', 25, 1);
INSERT INTO `user` VALUES (130, 1730405024, '123456', '刘一骅', '男', 25, 1);
INSERT INTO `user` VALUES (131, 1730405026, '123456', '刘鲁豫', '女', 25, 1);
INSERT INTO `user` VALUES (132, 1730405030, '123456', '刘博', '男', 25, 1);
INSERT INTO `user` VALUES (133, 1730405038, '123456', '王磊', '男', 25, 1);
INSERT INTO `user` VALUES (134, 1730405048, '123456', '李飞', '男', 25, 1);
INSERT INTO `user` VALUES (135, 1730405053, '123456', '刘白羽', '男', 25, 1);
INSERT INTO `user` VALUES (136, 1730405054, '123456', '何俊华', '女', 25, 1);
INSERT INTO `user` VALUES (137, 1730405059, '123456', '赵克强', '男', 25, 1);
INSERT INTO `user` VALUES (138, 1730405063, '123456', '白麒麟', '男', 25, 1);
INSERT INTO `user` VALUES (139, 1730405072, '123456', '翟亚东', '男', 25, 1);
INSERT INTO `user` VALUES (140, 1730405078, '123456', '蒋飞', '男', 25, 1);
INSERT INTO `user` VALUES (141, 1730405083, '123456', '何旭东', '男', 25, 1);
INSERT INTO `user` VALUES (142, 1730405089, '123456', '李孟涵', '男', 25, 1);
INSERT INTO `user` VALUES (143, 1730405093, '123456', '李子耀', '男', 25, 1);
INSERT INTO `user` VALUES (144, 1730405097, '123456', '李海洋', '男', 25, 1);
INSERT INTO `user` VALUES (145, 1730405098, '123456', '罗梦娇', '女', 25, 1);
INSERT INTO `user` VALUES (146, 1730405109, '123456', '陈硕', '男', 25, 1);
INSERT INTO `user` VALUES (147, 1730405114, '123456', '雷世昌', '男', 25, 1);
INSERT INTO `user` VALUES (148, 1730405127, '123456', '丁文浩', '男', 25, 1);
INSERT INTO `user` VALUES (149, 1730405137, '123456', '王学航', '男', 25, 1);
INSERT INTO `user` VALUES (150, 1730405138, '123456', '张霞', '女', 25, 1);
INSERT INTO `user` VALUES (151, 1730405142, '123456', '谭云辉', '男', 25, 1);
INSERT INTO `user` VALUES (152, 1730405147, '123456', '巴文博', '男', 25, 1);

SET FOREIGN_KEY_CHECKS = 1;
