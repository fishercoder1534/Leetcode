-- Write your PostgreSQL query statement below
-- 1. use to_char function
-- 2. use FM to strip padding space, FM is a data type formatting function in PostgreSQL that removes leading zeros and trailing spaces that would otherwise be added to make a pattern's output fixed-width
-- 3. Day gives you the day in the week
-- 4. DD gives you the day in the month
-- 5. YYYY gives you the year
select to_char(day, 'FMDay, FMMonth FMDD, YYYY') as day from Days;