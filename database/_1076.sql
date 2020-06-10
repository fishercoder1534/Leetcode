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