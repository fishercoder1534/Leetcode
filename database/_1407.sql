--# Write your MySQL query statement below

--credit: https://leetcode.com/problems/top-travellers/discuss/572803/MySQL-Simple-Solution
select name, sum(ifnull(distance, 0)) as travelled_distance
from rides r
right join users u
on r.user_id = u.id
group by name
order by 2 desc,1 asc;