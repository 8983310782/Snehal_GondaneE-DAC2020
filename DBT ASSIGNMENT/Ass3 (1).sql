use dbms;
create table department1(dept_id int(10) primary key,dept_name varchar(30));
create table employee1(empid int(10),emp_name varchar(30) NOT NULL,dept_id int(05), sal int(30) NOT NULL,manager int(10),
						constraint fk_dept_id foreign key (dept_id) references department1(dept_id));
desc department1;
desc employee1;
insert  into department1 values(01,'Finance'),(02,'Traning'),(03,'Marketing');
insert into employee1 values(01,'Arun',01,8000,4),(02,'Kiran',01,7000,01),(03,'scott',01,3000,01),(04,"Snehal",02,6000,01)
							,(05,"chaitu",02,8000,04),(06,"Sasa",02, 6000,02);
SELECT * FROM authors ORDER BY aname ;
select * from authors;
select * from publisher;
SELECT * FROM publisher ORDER BY pname DESC;
select * from employee1;
SELECT SUM(sal), dept_id FROM employee1 GROUP BY dept_id;
-- SELECT emp_id, sum(sal >7000) GROUP BY emp_id;
SELECT sum(sal), dept_id FROM employee1 GROUP BY dept_id
HAVING sum(sal) > 18000;
SELECT sum(sal), dept_id FROM employee1 GROUP BY dept_id
HAVING sum(sal) < 20000;