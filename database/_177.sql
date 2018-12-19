CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT Salary
      FROM Employee
      GROUP BY Salary
      ORDER BY Salary DESC
      LIMIT N, 1
  );
END
