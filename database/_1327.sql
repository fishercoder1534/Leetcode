--# Write your MySQL query statement below
--credit: https://leetcode.com/problems/list-the-products-ordered-in-a-period/discuss/491314/MYSQL

select a.product_name, sum(unit) as unit
from Products a
left join Orders b
on a.product_id = b.product_id
where b.order_date between '2020-02-01' and '2020-02-29'
group by a.product_id
having sum(unit) >= 100