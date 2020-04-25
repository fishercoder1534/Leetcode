--# Write your MySQL query statement below
select activity from Friends group by activity
having count(id) not in
(
select max(cnt) as cnt from
    (select count(*) as cnt from Friends group by activity) as t1
union
select min(cnt) as cnt from
    (select count(*) as cnt from Friends group by activity) as t2
)