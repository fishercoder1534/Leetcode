--# Write your MySQL query statement below
select a.student_name as member_A,
b.student_name as member_B,
c.student_name as member_C
from SchoolA a cross join SchoolB b cross join SchoolC c where a.student_name != b.student_name and
a.student_id != b.student_id and
b.student_name != c.student_name and
b.student_id != c.student_id and
a.student_name != c.student_name and
a.student_id != c.student_id;