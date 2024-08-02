-- Write your PostgreSQL query statement below
-- my completely original solution
with sessions_with_ads as (select p.customer_id, p.session_id, p.start_time, p.end_time, a.timestamp as ts, a.ad_id
                           from Playback p
                                    inner join Ads a
                                               on p.customer_id = a.customer_id and
                                                  a.timestamp between p.start_time and p.end_time)

select distinct(session_id)
from (select distinct(session_id) from Playback)
where session_id not in (select distinct(session_id) from sessions_with_ads)


