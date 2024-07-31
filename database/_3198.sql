-- # Write your MySQL query statement below
select state,
       group_concat(city order by city SEPARATOR ', ') as cities
from cities
group by state
order by state