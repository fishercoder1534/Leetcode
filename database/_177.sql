CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare m int;
set m=N-1;
  RETURN (
      # Write your MySQL query statement below.
    select distinct Salary from Employee order by Salary desc limit m, 1  
  );
END
