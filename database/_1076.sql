--1076. Project Employees II
--
--Table: Project
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| project_id  | int     |
--| employee_id | int     |
--+-------------+---------+
--(project_id, employee_id) is the primary key of this table.
--employee_id is a foreign key to Employee table.
--Table: Employee
--
--+------------------+---------+
--| Column Name      | Type    |
--+------------------+---------+
--| employee_id      | int     |
--| name             | varchar |
--| experience_years | int     |
--+------------------+---------+
--employee_id is the primary key of this table.
--
--
--Write an SQL query that reports all the projects that have the most employees.
--
--The query result format is in the following example:
--
--Project table:
--+-------------+-------------+
--| project_id  | employee_id |
--+-------------+-------------+
--| 1           | 1           |
--| 1           | 2           |
--| 1           | 3           |
--| 2           | 1           |
--| 2           | 4           |
--+-------------+-------------+
--
--Employee table:
--+-------------+--------+------------------+
--| employee_id | name   | experience_years |
--+-------------+--------+------------------+
--| 1           | Khaled | 3                |
--| 2           | Ali    | 2                |
--| 3           | John   | 1                |
--| 4           | Doe    | 2                |
--+-------------+--------+------------------+
--
--Result table:
--+-------------+
--| project_id  |
--+-------------+
--| 1           |
--+-------------+
--The first project has 3 employees while the second one has 2.

--# Write your MySQL query statement below
select project_id from Project
group by project_id
having count(employee_id) =
(
    select count(employee_id)
    from Project
    group by project_id
    order by count(employee_id)
    desc
    limit 1
)