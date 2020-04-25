select c.seat_id from cinema c where c.free = 1
and
(
    c.seat_id+1 in (select seat_id from cinema where free=1)
    or
    c.seat_id-1 in (select seat_id from cinema where free=1)
)
order by c.seat_id
