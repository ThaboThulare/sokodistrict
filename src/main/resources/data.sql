



insert into leave_type(leave_type) values('Annual Leave');
insert into leave_type(leave_type) values('Sick Leave');
insert into leave_type(leave_type) values('Family Responsibility Leave');
insert into leave_type(leave_type) values('Maternity Leave');


insert into leave_detail(leave_type_id,comments) values(1,'vacation');
insert into leave_detail(leave_type_id,comments) values(2,'sick');
insert into leave_detail(leave_type_id,comments) values(3,'sick');

insert into employee_leave(start_date,end_date)  values('2022-06-15','2015-18-22');
insert into employee_leave(start_date,end_date)  values('2022-07-22','2015-18-30');
insert into employee_leave(start_date,end_date)  values('2022-06-16','2015-30-16');


insert into leave_balance(bonus,balance)  values(1,10);
insert into leave_balance(bonus,balance)  values(4,15);
insert into leave_balance(bonus,balance)  values(3,18);

insert into employee_detail(leave_balance_id,employee_leave_id,first_name,last_name)  values(1,1,'Thabo','Thulare');
insert into employee_detail(leave_balance_id,employee_leave_id,first_name,last_name)  values(2,2,'Mandisa','Dlamini');
insert into employee_detail(leave_balance_id,employee_leave_id,first_name,last_name)  values(3,3,'Tee','Dlamini');

