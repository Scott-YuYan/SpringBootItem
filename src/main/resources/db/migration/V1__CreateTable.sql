--用户表

create table user(name varchar(200),
id bigint primary key auto_increment);

--成绩表
create table score(
id bigint primary key auto_increment,
user_id bigint,
Score bigint);

insert into user(name,id) values
('大娃',1),('二娃',2),('三娃',3),('四娃',4),('五娃',5),('六娃',6);

insert into score(id,user_id,score) values
(1,1,90),(2,2,91),(3,3,89),(4,4,88),(5,5,92),(6,6,94),(7,2,2),(8,4,3);