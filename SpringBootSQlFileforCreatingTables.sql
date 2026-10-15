create database SpringBootDemo;
use springBootDemo;

Create table topic (id varchar(50), name varchar(50), description varchar(50));
select * from topic;

Create table course (id varchar(50), name varchar(50), description varchar(50));
ALTER TABLE course ADD COLUMN topic_id VARCHAR(50);
select * from course;

