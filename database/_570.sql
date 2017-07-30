--570. Managers with at Least 5 Direct Reports
--The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.
--
--+------+----------+-----------+----------+
--|Id    |Name 	  |Department |ManagerId |
--+------+----------+-----------+----------+
--|101   |John 	  |A 	      |null      |
--|102   |Dan 	  |A 	      |101       |
--|103   |James 	  |A 	      |101       |
--|104   |Amy 	  |A 	      |101       |
--|105   |Anne 	  |A 	      |101       |
--|106   |Ron 	  |B 	      |101       |
--+------+----------+-----------+----------+
--Given the Employee table, write a SQL query that finds out managers with at least 5 direct report. For the above table, your SQL query should return:
--
--+-------+
--| Name  |
--+-------+
--| John  |
--+-------+
--Note:
--No one would report to himself.

select Name from Employee as Name where Id in
    (select ManagerId from Employee group by ManagerId having count(*) >= 5)
;