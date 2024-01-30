-- # Write your MySQL query statement below
select
    product_id,
    max(case when store = 'store1' then price end) as store1,
    max(case when store = 'store2' then price end) as store2,
    max(case when store = 'store3' then price end) as store3
from
    Products
group by
    product_id