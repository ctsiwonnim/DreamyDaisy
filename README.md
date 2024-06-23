# DreamyDaisy
키링 쇼핑몰 웹 사이트

계정 
test@localhost identified by '4412';
db : DreamyDaisy;

-- 회원 테이블
drop table if exists member_table;
create table member_table(
	id bigint primary key auto_increment,
	email varchar(20) unique,
	name varcher(20),
	password varcher(20),
	phone varcher(30)
);
