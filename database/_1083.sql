select distinct buyer_id from Sales s
join Product p
on p.product_id = s.product_id
where p.product_name = 'S8'
and buyer_id not in
(
select buyer_id from Sales s
    join Product p on p.product_id = s.product_id
    where p.product_name = 'iPhone'
)