-- 在本地创建 www 用户密码为 www
CREATE user 'www'@'%' identified by 'www';

-- 创建api库
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `api` /*!40100 DEFAULT CHARACTER SET utf8 */;

-- 赋予本地 www 用户 在 api 库，全权限
USE mysql;
UPDATE user set host='%' WHERE user='www';
GRANT all privileges on api.* to www@'%';

-- 切换到api库
USE `api`;

-- 创建userinfo表
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE
  `userinfo` (
    `id` int (10) NOT NULL AUTO_INCREMENT,
    `username` varchar(30) NOT NULL,
    `password` varchar(30) NOT NULL,
    `authority` varchar(30) NOT NULL,
    PRIMARY KEY (`id`)
  ) ENGINE = InnoDB AUTO_INCREMENT = 3 DEFAULT CHARSET = utf8;

-- 插入数据
insert into
  `userinfo` (`id`, `username`, `password`, `authority`)
values
  (1, 'root', '123456', 'admin'),
  (2, 'me', '123456', 'admin');