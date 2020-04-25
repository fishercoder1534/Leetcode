select s.product_id, p.product_name from Sales s
join Product p using(product_id)
group by product_id
having min(s.sale_date) >= '2019-01-01' and max(s.sale_date) <= '2019-03-31 ';