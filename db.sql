DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news`
(
    `news_id`  int(11)      NOT NULL AUTO_INCREMENT COMMENT '新闻id',
    `title`    varchar(50)  NOT NULL COMMENT '标题',
    `content`  varchar(255) NOT NULL COMMENT '内容',
    `uid`      int(11)      NOT NULL,
    `pub_time` datetime     NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`news_id`),
    KEY `k_u_id` (`uid`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 20
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `uid`      int(11)     NOT NULL AUTO_INCREMENT,
    `username` varchar(20) NOT NULL,
    `password` varchar(18) NOT NULL,
    PRIMARY KEY (`uid`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8;
