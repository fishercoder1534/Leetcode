--In Math, three segments can form a triangle only if the sum of any of the two segments is larger than the third one.

select x, y, z,
case when x+y <= z or
        x+z <= y or
        y+z <= x
    then "No"
    else "Yes"
end as "triangle"
from triangle;