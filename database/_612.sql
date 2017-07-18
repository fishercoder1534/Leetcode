select round(sqrt(min(power(p1.x - p2.x, 2) + power(p1.y - p2.y, 2))), 2) as shortest
from point_2d as p1
join point_2d as p2
where p1.x <> p2.x or p1.y <> p2.y;--it should be OR here instead of AND