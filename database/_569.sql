--569. Median Employee Salary
-- The Employee table holds all employees. The employee table has three columns: Employee Id, Company Name, and Salary.
--
--+-----+------------+--------+
--|Id   | Company    | Salary |
--+-----+------------+--------+
--|1    | A          | 2341   |
--|2    | A          | 341    |
--|3    | A          | 15     |
--|4    | A          | 15314  |
--|5    | A          | 451    |
--|6    | A          | 513    |
--|7    | B          | 15     |
--|8    | B          | 13     |
--|9    | B          | 1154   |
--|10   | B          | 1345   |
--|11   | B          | 1221   |
--|12   | B          | 234    |
--|13   | C          | 2345   |
--|14   | C          | 2645   |
--|15   | C          | 2645   |
--|16   | C          | 2652   |
--|17   | C          | 65     |
--+-----+------------+--------+
--
--Write a SQL query to find the median salary of each company. Bonus points if you can solve it without using any built-in SQL functions.
--
--+-----+------------+--------+
--|Id   | Company    | Salary |
--+-----+------------+--------+
--|5    | A          | 451    |
--|6    | A          | 513    |
--|12   | B          | 234    |
--|9    | B          | 1154   |
--|14   | C          | 2645   |
--+-----+------------+--------+

select Id, Company, Salary from
(
select e.Id, e.Salary, e.Company,  if( @prev = e.Company , @Rank := @Rank + 1, @Rank := 1) as rank, @prev := e.Company
from Employee e , (select @Rank := 0, @prev := 0) as temp order by e.Company, e.Salary, e.Id
) Ranking
INNER JOIN
(
select count(*) as totalcount, Company as name from Employee e2 group by e2.Company
) companycount
on companycount.name = Ranking.Company
where Rank = floor((totalcount+1)/2) or Rank = floor((totalcount+2)/2)