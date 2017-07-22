select id, count(*) num from
(
    (select requester_id id from request_accepted)
    union all
    (select accepter_id id from request_accepted)
) as A
group by id order by num desc limit 1;