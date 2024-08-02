-- Write your PostgreSQL query statement below
with employee_bonus as (
    select employee_id, salary as bonus from Employees where name not like 'M%' and employee_id % 2 = 1
    ),
    non_employee_bonus as (
    select employee_id, 0 as bonus from Employees where employee_id not in (
        select employee_id from employee_bonus
    ))

select * from employee_bonus
union
select * from non_employee_bonus
order by employee_id