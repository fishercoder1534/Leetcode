--reference: https://discuss.leetcode.com/topic/92752/accept-solution and https://leetcode.com/articles/students-report-by-geography/#approach-using-session-variables-and-join-accepted

set @a = 0;
set @b = 0;
set @c = 0;

Select America.name as America, Asia.name as Asia, Europe.name as Europe from
(select name, @a := @a + 1 as id from student where continent = 'America' order by name) as America
Left Join
(select name, @b := @b + 1 as id from student where continent = 'Asia' order by name) as Asia on America.id = Asia.id
Left Join
(select name, @c := @c + 1 as id from student where continent = 'Europe' order by name) as Europe on America.id = Europe.id
