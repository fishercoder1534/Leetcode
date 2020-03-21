--1384. Total Sales Amount by Year
--
--Table: Product
--
--+---------------+---------+
--| Column Name   | Type    |
--+---------------+---------+
--| product_id    | int     |
--| product_name  | varchar |
--+---------------+---------+
--product_id is the primary key for this table.
--product_name is the name of the product.
--
--
--Table: Sales
--
--+---------------------+---------+
--| Column Name         | Type    |
--+---------------------+---------+
--| product_id          | int     |
--| period_start        | varchar |
--| period_end          | date    |
--| average_daily_sales | int     |
--+---------------------+---------+
--product_id is the primary key for this table.
--period_start and period_end indicates the start and end date for sales period, both dates are inclusive.
--The average_daily_sales column holds the average daily sales amount of the items for the period.
--
--Write an SQL query to report the Total sales amount of each item for each year, with corresponding product name, product_id, product_name and report_year.
--
--Dates of the sales years are between 2018 to 2020. Return the result table ordered by product_id and report_year.
--
--The query result format is in the following example:
--
--
--Product table:
--+------------+--------------+
--| product_id | product_name |
--+------------+--------------+
--| 1          | LC Phone     |
--| 2          | LC T-Shirt   |
--| 3          | LC Keychain  |
--+------------+--------------+
--
--Sales table:
--+------------+--------------+-------------+---------------------+
--| product_id | period_start | period_end  | average_daily_sales |
--+------------+--------------+-------------+---------------------+
--| 1          | 2019-01-25   | 2019-02-28  | 100                 |
--| 2          | 2018-12-01   | 2020-01-01  | 10                  |
--| 3          | 2019-12-01   | 2020-01-31  | 1                   |
--+------------+--------------+-------------+---------------------+
--
--Result table:
--+------------+--------------+-------------+--------------+
--| product_id | product_name | report_year | total_amount |
--+------------+--------------+-------------+--------------+
--| 1          | LC Phone     |    2019     | 3500         |
--| 2          | LC T-Shirt   |    2018     | 310          |
--| 2          | LC T-Shirt   |    2019     | 3650         |
--| 2          | LC T-Shirt   |    2020     | 10           |
--| 3          | LC Keychain  |    2019     | 31           |
--| 3          | LC Keychain  |    2020     | 31           |
--+------------+--------------+-------------+--------------+
--LC Phone was sold for the period of 2019-01-25 to 2019-02-28, and there are 35 days for this period. Total amount 35*100 = 3500.
--LC T-shirt was sold for the period of 2018-12-01 to 2020-01-01, and there are 31, 365, 1 days for years 2018, 2019 and 2020 respectively.
--LC Keychain was sold for the period of 2019-12-01 to 2020-01-31, and there are 31, 31 days for years 2019 and 2020 respectively.
--

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