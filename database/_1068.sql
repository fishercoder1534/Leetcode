select p.product_name, s.year, s.price
from Product p
join Sales s
on s.product_id = p.product_id