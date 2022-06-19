
create table leave_balance
(
    id      integer auto_increment not null primary key,
    bonus   integer,
    balance integer
);


create table employee_leave
(
    id integer auto_increment not null primary key,
    start_date varchar(26) not null,
    end_date varchar(26) not null
);

create table employee_detail
(
  id integer auto_increment not null primary key,
  leave_balance_id integer not null,
  employee_leave_id integer not null,
  first_name varchar(45) not null,
  last_name varchar(45) not null,
  constraint employee_detail_fk1 foreign key (leave_balance_id) references leave_balance(id),
  constraint employee_detail_fk2 foreign key (employee_leave_id) references employee_leave (id)

);


create table leave_type
(
    id integer auto_increment not null primary key,
    leave_type varchar(45) not null
);

create table leave_detail
(
 id integer auto_increment not null primary key,
 leave_type_id integer auto_increment not null,
 comments varchar(45) not null,
 constraint leave_type_fk1 foreign key (leave_type_id) references leave_type(id)
);

