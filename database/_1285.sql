select l1.log_id as start_id, min(l2.log_id) as end_id
from
(
select log_id from Logs where log_id - 1 not in (select log_id from Logs)
) l1,
(
select log_id from Logs where log_id + 1 not in (select log_id from Logs)
) l2
where l1.log_id <= l2.log_id
group by l1.log_id;
