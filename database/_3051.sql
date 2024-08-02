-- Write your PostgreSQL query statement below
select candidate_id from Candidates
where skill in ('Python', 'Tableau', 'PostgreSQL') group by 1
having count(candidate_id) = 3 order by 1