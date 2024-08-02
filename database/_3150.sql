-- Write your PostgreSQL query statement below
select tweet_id
from tweets
where length(content) > 140
   or regexp_count(content, '@\w') > 3
   or regexp_count(content, '#\w') > 3
order by 1