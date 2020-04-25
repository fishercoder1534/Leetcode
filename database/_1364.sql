--credit: https://leetcode.com/problems/number-of-trusted-contacts-of-a-customer/discuss/522435/mysql-simple-solution

select i.invoice_id,
c.customer_name,
i.price,
count(cont.contact_name) contacts_cnt,
sum(
    if(cont.contact_name in (select distinct customer_name from customers), 1, 0)
) as trusted_contacts_cnt
from invoices i
join customers c on c.customer_id = i.user_id
left join Contacts cont on cont.user_id = c.customer_id
group by i.invoice_id
order by i.invoice_id;
