--# Write your MySQL query statement below

select uni.unique_id, emp.name from Employees emp
left join
EmployeeUNI uni
on emp.id = uni.id