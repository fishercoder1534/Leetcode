/* Write your T-SQL query statement below */
--credit: https://leetcode.com/problems/total-sales-amount-by-year/discuss/544812/Using-Recursive-CTE-to-get-all-the-possible-dates

with dates as
(select s_date =  min(period_start), e_date = max(period_end) from sales
	union all
 select dateadd(day, 1 ,s_date) , e_date from dates
 where s_date<e_date
)
select
PRODUCT_ID  = cast(p.product_id  as varchar(200))
,PRODUCT_NAME = p.product_name
,REPORT_YEAR = cast(year(s_date) as varchar(10))
,TOTAL_AMOUNT = sum(average_daily_sales)
from product p
left outer join sales s on p.product_id = s.product_id
left outer join dates d on d.s_date between s.period_start and s.period_end
group by p.product_id , p.product_name, year(s_date)
order by 1,3
option(maxrecursion 0)