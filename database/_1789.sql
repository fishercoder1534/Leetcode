-- # Write your MySQL query statement below
select employee_id, department_id
from (select *, count(employee_id) over(partition by employee_id) as EmployeeCount from Employee) EP
where EmployeeCount = 1
   or primary_flag = 'Y';