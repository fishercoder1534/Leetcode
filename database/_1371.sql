--# Write your MySQL query statement below
select b.employee_id, b.name, count(*) as reports_count, round(avg(a.age)) as average_age
from Employees a join Employees b on a.reports_to = b.employee_id
group by b.employee_id
order by b.employee_id