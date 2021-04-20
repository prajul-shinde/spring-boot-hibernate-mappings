insert into Location(id,name) values(1,'Delhi,India');
insert into Location(id,name) values(2,'California,USA');
insert into Location(id,name) values(3,'Dhaka,Bangladesh');

insert into User(id,first_name,last_name,email,locationid) values(1,'prajul','shinde','prajul@gmail.com',1);
insert into User(id,first_name,last_name,email,locationid) values(2,'onkar','shinde','onkar@gmail.com',2);
insert into User(id,first_name,last_name,email,locationid) values(3,'sampat','shinde','sampat@gmail.com',3);

insert into Post (id,post_date,details,userid) values(1,CURRENT_TIMESTAMP(),'very good post',1);
insert into Post (id,post_date,details,userid) values(5,CURRENT_TIMESTAMP(),'very good post again',1);
insert into Post (id,post_date,details,userid) values(2,CURRENT_TIMESTAMP(),'a rainy day',2);
insert into Post (id,post_date,details,userid) values(3,CURRENT_TIMESTAMP(),'nice anime',3);
