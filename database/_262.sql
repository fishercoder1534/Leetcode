select t.Request_at as Day,
round(sum(case when t.Status like 'cancelled_%' then 1 else 0 end)/count(*), 2) as 'Cancellation Rate'
from Trips t
inner join Users u
on t.Client_Id = u.Users_Id and u.Banned = 'No'
where t.Request_at between '2013-10-01' and '2013-10-03' group by t.Request_at