select distinct l1.Num as ConsecutiveNums from Logs l1, Logs l2, Logs l3
where l1.Id = l2.Id-1 and l2.Id = l3.Id-1
and l1.Num = l2.Num and l2.Num = l3.Num
