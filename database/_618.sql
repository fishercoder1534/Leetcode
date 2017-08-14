--618. Students Report By Geography
--
--A U.S graduate school has students from Asia, Europe and America. The students' location information are stored in table student as below.
--
--| name   | continent |
--|--------|-----------|
--| Jack   | America   |
--| Pascal | Europe    |
--| Xi     | Asia      |
--| Jane   | America   |
--Pivot the continent column in this table so that each name is sorted alphabetically and displayed underneath its corresponding continent. The output headers should be America, Asia and Europe respectively. It is guaranteed that the student number from America is no less than either Asia or Europe.
--For the sample input, the output is:
--| America | Asia | Europe |
--|---------|------|--------|
--| Jack    | Xi   | Pascal |
--| Jane    |      |        |
--Follow-up: If it is unknown which continent has the most students, can you write a query to generate the student report?

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
