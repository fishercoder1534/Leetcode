select seller_id from Sales as seller_id
group by seller_id
having sum(price) = (
    select sum(price) as total_price from Sales
    group by seller_id
    order by total_price desc
    limit 1
)