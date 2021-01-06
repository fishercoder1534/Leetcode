-- # Write your MySQL query statement below
with groupedBy as (
    select "[0-5>" as bin, 0 as minDuration, 60*5 as maxDuration
    union all
    select "[5-10>" as bin, 60*5 as minDuration, 60*10 as maxDuration
    union all
    select "[10-15>" as bin, 60*10 as minDuration, 60*15 as maxDuration
    union all
    select "15 or more" as bin, 60*15 as minDuration, 2147483647 as maxDuration
)

select bin, count(session_id) as total from groupedBy
left join Sessions on duration >= minDuration and duration < maxDuration
group by bin;