-- Write your MySQL query statement below
-- my completely original solution
select user_id
from emails as e
         join texts as t on e.email_id = t.email_id
where date_add(date(e.signup_date), Interval 1 Day) = date (t.action_date) and signup_action = 'Verified'
order by user_id
