--1251. Average Selling Price
--
--Table: Prices
--
--+---------------+---------+
--| Column Name   | Type    |
--+---------------+---------+
--| product_id    | int     |
--| start_date    | date    |
--| end_date      | date    |
--| price         | int     |
--+---------------+---------+
--(product_id, start_date, end_date) is the primary key for this table.
--Each row of this table indicates the price of the product_id in the period from start_date to end_date.
--For each product_id there will be no two overlapping periods. That means there will be no two intersecting periods for the same product_id.
--
--
--Table: UnitsSold
--
--+---------------+---------+
--| Column Name   | Type    |
--+---------------+---------+
--| product_id    | int     |
--| purchase_date | date    |
--| units         | int     |
--+---------------+---------+
--There is no primary key for this table, it may contain duplicates.
--Each row of this table indicates the date, units and product_id of each product sold.
--
--
--Write an SQL query to find the average selling price for each product.
--
--average_price should be rounded to 2 decimal places.
--
--The query result format is in the following example:
--
--Prices table:
--+------------+------------+------------+--------+
--| product_id | start_date | end_date   | price  |
--+------------+------------+------------+--------+
--| 1          | 2019-02-17 | 2019-02-28 | 5      |
--| 1          | 2019-03-01 | 2019-03-22 | 20     |
--| 2          | 2019-02-01 | 2019-02-20 | 15     |
--| 2          | 2019-02-21 | 2019-03-31 | 30     |
--+------------+------------+------------+--------+
--
--UnitsSold table:
--+------------+---------------+-------+
--| product_id | purchase_date | units |
--+------------+---------------+-------+
--| 1          | 2019-02-25    | 100   |
--| 1          | 2019-03-01    | 15    |
--| 2          | 2019-02-10    | 200   |
--| 2          | 2019-03-22    | 30    |
--+------------+---------------+-------+
--
--Result table:
--+------------+---------------+
--| product_id | average_price |
--+------------+---------------+
--| 1          | 6.96          |
--| 2          | 16.96         |
--+------------+---------------+
--Average selling price = Total Price of Product / Number of products sold.
--Average selling price for product 1 = ((100 * 5) + (15 * 20)) / 115 = 6.96
--Average selling price for product 2 = ((200 * 15) + (30 * 30)) / 230 = 16.96

select a.product_id, round(
    sum(a.price * b.units)/sum(b.units),
    2) as average_price
from Prices as a
join UnitsSold as b
on a.product_id = b.product_id and (b.purchase_date between a.start_date and a.end_date)
group by a.product_id;

