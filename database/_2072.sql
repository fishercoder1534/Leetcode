-- Write your PostgreSQL query statement below


with excellent_std_cnts as (select (select count(student_id) from NewYork where score >= 90)    as ny,
                                   (select count(student_id) from California where score >= 90) as ca)

select (case
            when E.ny > E.ca then 'New York University'
            when E.ny < E.ca then 'California University'
            else 'No Winner'
    end
           ) as winner
from excellent_std_cnts as E