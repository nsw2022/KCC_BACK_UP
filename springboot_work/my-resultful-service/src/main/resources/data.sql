insert into users (id, name, join_date, password, ssn) values (9001, 'kim', now(), 'pass1','701010-1111111');
insert into users (id, name, join_date, password, ssn) values (9002, 'park', now(), 'pass2','801010-1111111');
insert into users (id, name, join_date, password, ssn) values (9003, 'lee', now(), 'pass3','901010-1111111');

insert into post (description, user_id) values ('My first post',9001);
insert into post (description, user_id) values ('나의 두번째여',9001);