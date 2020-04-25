select c.country_name as country_name,
case
when avg(weather_state) <= 15 then "Cold"
when avg(weather_state) >= 25 then "Hot"
else "Warm"
end
as weather_type
from Countries c
join Weather w
on c.country_id = w.country_id
and w.day between "2019-11-01" and "2019-11-30"
group by c.country_id
