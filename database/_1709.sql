--# Write your MySQL query statement below
with diff_table as (
select user_id, datediff(lead(visit_date, 1, '2021-1-1') over (partition by user_id order by visit_date), visit_date) as diff from UserVisits
)

select user_id, max(diff) as biggest_window from diff_table group by user_id order by user_id
