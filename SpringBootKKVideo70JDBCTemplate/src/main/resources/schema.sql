drop table if exists employee;
create table employee
(
	employee_id serial integer not null primary key,
	employee_name varchar(255),
	email varchar(255),
	salary double
)