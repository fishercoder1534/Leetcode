select FORMAT(avg(n.Number),4)*1.0 as median
from Numbers n left join
(
select Number, @prev := @count as prevNumber, (@count := @count + Frequency) as countNumber
from Numbers,
(select @count := 0, @prev := 0, @total := (select sum(Frequency) from Numbers)) temp order by Number
) n2
on n.Number = n2.Number
where
(prevNumber < floor((@total+1)/2) and countNumber >= floor((@total+1)/2))
or
(prevNumber < floor((@total+2)/2) and countNumber >= floor((@total+2)/2))