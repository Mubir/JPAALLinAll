insert into course(id,name,created_time,last_updated_time) values(121,'hola-amigo',sysdate(),sysdate());
insert into course(id,name,created_time,last_updated_time) values(122,'Spanish',sysdate(),sysdate());
insert into course(id,name,created_time,last_updated_time) values(123,'japanese',sysdate(),sysdate());
insert into course(id,name,created_time,last_updated_time) values(124,'english',sysdate(),sysdate());

insert into passport(id,number) values (0091,'XA124553');
insert into passport(id,number) values (0092,'Ma897934');
insert into passport(id,number) values (0093,'UK893892');
insert into passport(id,number) values (0094,'PL242242');

insert into student(id,name,passport_id) values (2001,'rick',0091);
insert into student(id,name,passport_id) values (2002,'morty',0093);
insert into student(id,name,passport_id) values (2003,'lily',0094);
insert into student(id,name,passport_id) values (2004,'shalby',0092);
/*to join
SELECT * FROM STUDENT ,PASSPORT WHERE STUDENT.PASSPORT_ID=PASSPORT.ID

*/
insert into review(id,rating,discription) values (06,'1',' hello rick ');
insert into review(id,rating,discription) values (05,'3',' hello morty ');
insert into review(id,rating,discription) values (02,'4',' hello lily ');
insert into review(id,rating,discription) values (09,'5',' hello shalby ');

