CREATE TABLE `book` (
  `book_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '书编号',
  `book_name` varchar(30) NOT NULL COMMENT '书名',
  `avail_num` bigint(20) NOT NULL COMMENT '结算单金额',
  `author` varchar(30) NOT NULL COMMENT '作者',
  `publish_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出版日期',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  PRIMARY KEY (`book_id`)
)

insert into book (book_id, book_name, avail_num, author, publish_time) values(1, '三国演义', 120, '罗贯中', '1967-12-06');