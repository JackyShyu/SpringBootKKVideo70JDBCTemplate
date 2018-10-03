drop table if exists employee;
create table employee
(
	employee_id serial primary key,
	employee_name varchar(255),
	email varchar(255),
	salary NUMERIC (6, 2)
)