select employee_id, team_size from Employee e
left join
(
select team_id, count(distinct(employee_id)) as team_size from Employee group by team_id
) as t
on e.team_id = t.team_id;