select D.Name as Department, E.Name as Employee, E.Salary as Salary
from Department D, Employee E
where (select(count(distinct(salary))) from Employee
      where DepartmentId = E.DepartmentId and Salary > E.Salary) < 3
and E.DepartmentId = D.Id
order by E.DepartmentId, E.Salary desc;