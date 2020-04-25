select s.sub_id as post_id,
(select count(distinct(s1.sub_id)) from Submissions s1 where s1.parent_id = s.sub_id) as number_of_comments
from Submissions s
where s.parent_id is null
group by s.sub_id;