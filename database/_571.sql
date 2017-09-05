--571. Find Median Given Frequency of Numbers
-- The Numbers table keeps the value of number and its frequency.
--
--+----------+-------------+
--|  Number  |  Frequency  |
--+----------+-------------|
--|  0       |  7          |
--|  1       |  1          |
--|  2       |  3          |
--|  3       |  1          |
--+----------+-------------+
--
--In this table, the numbers are 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 3, so the median is (0 + 0) / 2 = 0.
--
--+--------+
--| median |
--+--------|
--| 0.0000 |
--+--------+
--
--Write a query to find the median of all numbers and name the result as median.

select FORMAT(avg(n.Number),4)*1.0 as median
from Numbers n left join
(
select Number, @prev := @count as prevNumber, (@count := @count + Frequency) as countNumber
from Numbers,
(select @count := 0, @prev := 0, @total := (select sum(Frequency) from Numbers)) temp order by Number
) n2
on n.Number = n2.Number
where
(prevNumber < floor((@total+1)/2) and countNumber >= floor((@total+1)/2))
or
(prevNumber < floor((@total+2)/2) and countNumber >= floor((@total+2)/2))