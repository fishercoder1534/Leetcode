--# Write your MySQL query statement below
select user_id, concat(UCASE(LEFT(name, 1)), LCASE(SUBSTRING(name, 2))) as name from Users order by user_id;