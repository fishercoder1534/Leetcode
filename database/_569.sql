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