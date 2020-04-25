select Name from Employee as Name where Id in
    (select ManagerId from Employee group by ManagerId having count(*) >= 5)
;