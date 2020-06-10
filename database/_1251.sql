select a.product_id, round(
    sum(a.price * b.units)/sum(b.units),
    2) as average_price
from Prices as a
join UnitsSold as b
on a.product_id = b.product_id and (b.purchase_date between a.start_date and a.end_date)
group by a.product_id;