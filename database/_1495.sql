--# Write your MySQL query statement below
select title from Content where Kids_content = 'Y' and content_id in (
select content_id from TVProgram where program_date between '2020-06-01 00:00' and '2020-06-30 23:59'
) and content_type = 'Movies'