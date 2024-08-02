-- Write your PostgreSQL query statement below
select problem_id
from Problems
where (likes / ((likes + dislikes) * 1.0)) < 0.6
order by 1;