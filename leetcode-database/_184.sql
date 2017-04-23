select D.Name as Department, E.Name as Employee, E.Salary from Employee E, Department D
where E.DepartmentId = D.Id
and (DepartmentId, Salary) in 
(select DepartmentId, max(Salary) as max from Employee group by DepartmentId)
