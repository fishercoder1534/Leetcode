--credit: https://leetcode.com/problems/the-most-frequently-ordered-products-for-each-customer/discuss/861257/simple-and-easy-solution-using-window-function

select customer_id, product_id, product_name from
(
    select o.customer_id, o.product_id, p.product_name,
    rank() over (partition by customer_id order by count(o.product_id) desc) as ranking
    from Orders o
    join Products p
    on o.product_id = p.product_id
    group by customer_id, product_id
) tmp
where ranking = 1
order by customer_id, product_id