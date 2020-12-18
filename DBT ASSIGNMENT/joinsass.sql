use assignment;

 create table Department(
   dept_id int(1) primary key,
   dept_name varchar(50)
   );

create table Employee(
	empid int (2) Auto_increment primary key,
	emp_name varchar(10),
	dept_id int(1),
	salary int(4),
	manager int(1),
	foreign key (dept_id)
	references Department (dept_id);

insert into Employee (emp_name, dept_id, salary, manager) values
	('Arun', 1, 8000, 4),
	('Kiran', 1, 7000, 1),
	('Scott', 1, 3000, 1),
	('Max', 2, 9000, null),
	('Jack', 2, 8000, 4),
	('King',null,6000,1);

insert into Department values
	(1, 'Finance'),
	(2, 'Training'),
	(3, 'Marketing');


-- 1. select dept_name and emp_name where dept_id is same.
select dept_name , emp_name from employee inner join department on employee.dept_id = department.dept_id;

-- 2. select all from both tables where dept_id is same.
select * from  department inner join employee on employee.dept_id = department.dept_id;

-- 3. select dept_id and sum of salary group it by dept_id.
select dept_id , sum(salary) from employee group by dept_id  ;
 
-- 4. select dept_name and emp_name apply right outer join and left outer join.
select * from employee right outer join department on employee.dept_id = department.dept_id ;
select * from employee left outer join department on employee.dept_id = department.dept_id ;

-- 5. select emp_name with their respective manager names.
select emp_name , manager from employee ;

-- 6. select epm_name with their respective department names.
select emp_name , dept_name from department inner join employee on employee.dept_id = department.dept_id;


create table emp1(emp_no int ,     emp_name varchar(20));
insert into emp1 values( 1 , 'A' );
insert into emp1 values( 2 , 'B' );
insert into emp1 values( 3 , 'C');

create table emp2( emp_no int , emp_name varchar(20) );
insert into emp1 values( 1 , 'A'  );
insert into emp1 values( 2 , 'B' );
insert into emp1 values( 4 , 'D' );
insert into emp1 values( 5 , 'E' );

-- 1.	select same data from both table.
SELECT * FROM emp1 UNION select * from emp2 ;
--  select employee having same salary as Arun
select empid,emp_name from employee where salary=(select salary from employee where emp_name='Arun');

-- select employee belonging to same dept as 'jack'.

 select empid,emp_name from employee where dept_id=(select dept_id from employee where emp_name='Jack');
 
-- select name of employee having lowest salary.
select emp_name,salary from employee where salary=(select min(salary) from employee);

-- update salary = 15000 of employees belonging  to same dept as 'Max'.
update employee set salary=15000 where dept_id=(select dept_id  where emp_name='Max');
