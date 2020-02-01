--1082. Sales Analysis I
--
--Table: Product
--
--+--------------+---------+
--| Column Name  | Type    |
--+--------------+---------+
--| product_id   | int     |
--| product_name | varchar |
--| unit_price   | int     |
--+--------------+---------+
--product_id is the primary key of this table.
--Table: Sales
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| seller_id   | int     |
--| product_id  | int     |
--| buyer_id    | int     |
--| sale_date   | date    |
--| quantity    | int     |
--| price       | int     |
--+------ ------+---------+
--This table has no primary key, it can have repeated rows.
--product_id is a foreign key to Product table.
--
--
--Write an SQL query that reports the best seller by total sales price, If there is a tie, report them all.
--
--The query result format is in the following example:
--
--Product table:
--+------------+--------------+------------+
--| product_id | product_name | unit_price |
--+------------+--------------+------------+
--| 1          | S8           | 1000       |
--| 2          | G4           | 800        |
--| 3          | iPhone       | 1400       |
--+------------+--------------+------------+
--
--Sales table:
--+-----------+------------+----------+------------+----------+-------+
--| seller_id | product_id | buyer_id | sale_date  | quantity | price |
--+-----------+------------+----------+------------+----------+-------+
--| 1         | 1          | 1        | 2019-01-21 | 2        | 2000  |
--| 1         | 2          | 2        | 2019-02-17 | 1        | 800   |
--| 2         | 2          | 3        | 2019-06-02 | 1        | 800   |
--| 3         | 3          | 4        | 2019-05-13 | 2        | 2800  |
--+-----------+------------+----------+------------+----------+-------+
--
--Result table:
--+-------------+
--| seller_id   |
--+-------------+
--| 1           |
--| 3           |
--+-------------+
--Both sellers with id 1 and 3 sold products with the most total price of 2800.

--# Write your MySQL query statement below
--credit: https://leetcode.com/problems/sales-analysis-i/discuss/349042/MySQL-Solution

select seller_id from Sales as seller_id
group by seller_id
having sum(price) = (
    select sum(price) as total_price from Sales
    group by seller_id
    order by total_price desc
    limit 1
)