--# Write your MySQL query statement below
select sale_date as SALE_DATE, (o.sold_num - a.sold_num) as DIFF from Sales a join Sales o using(sale_date) group by sale_date order by sale_date