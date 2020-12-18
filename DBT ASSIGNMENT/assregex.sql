use edac;
select * from emp;
select * from dept;
-- 1
select ename from emp where ename regexp '^[s]';
-- 2
select ename from emp where ename regexp '[h]$';
-- 3
select ename from emp where ename regexp 'oj|sh'; 
-- 4

select ename from emp where ename regexp '[sh]';
-- 5
CREATE TABLE tutorial (
id INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY, 
title VARCHAR(200), 
description TEXT, 
FULLTEXT(title,description)
) ;


INSERT INTO tutorial (title,description) VALUES
('SQL Joins','An SQL JOIN clause combines rows from two or more tables. It creates a set of rows in a temporary table.'),
('SQL Equi Join','SQL EQUI JOIN performs a JOIN against equality or matching column(s) values of the associated tables. An equal sign (=) is used as comparison operator in the where clause to refer equality.'),
('SQL Left Join','The SQL LEFT JOIN, joins two tables and fetches rows based on a condition, which is matching in both the tables and the unmatched rows will also be available from the table before the JOIN clause.'),
('SQL Cross Join','The SQL CROSS JOIN produces a result set which is the number of rows in the first table multiplied by the number of rows in the second table, if no WHERE clause is used along with CROSS JOIN.'),
('SQL Full Outer Join','In SQL the FULL OUTER JOIN combines the results of both left and right outer joins and returns all (matched or unmatched) rows from the tables on both sides of the join clause.'),
('SQL Self Join','A self join is a join in which a table is joined with itself (which is also called Unary relationships), especially when the table has a FOREIGN KEY which references its own PRIMARY KEY.');


select description from tutorial where match(title,description) against ('left right' in natural language mode);

-- 7

select count(description) from tutorial where match (title,description) against ('left right' in natural language mode);

-- 8

select * from tutorial where match(title,description) against ('+Joins -right' in boolean mode);