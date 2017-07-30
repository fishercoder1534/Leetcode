--614. Second Degree Follower
--In facebook, there is a follow table with two columns: followee, follower.
--
--Please write a sql query to get the amount of each follower’s follower if he/she has one.
--
--For example:
--
--+-------------+------------+
--| followee    | follower   |
--+-------------+------------+
--|     A       |     B      |
--|     B       |     C      |
--|     B       |     D      |
--|     D       |     E      |
--+-------------+------------+
--should output:
--+-------------+------------+
--| follower    | num        |
--+-------------+------------+
--|     B       |  2         |
--|     D       |  1         |
--+-------------+------------+
--Explaination:
--Both B and D exist in the follower list, when as a followee, B's follower is C and D, and D's follower is E. A does not exist in follower list.
--Note:
--Followee would not follow himself/herself in all cases.
--Please display the result in follower's alphabet order.

select f1.follower, count(distinct f2.follower) as num
from follow f1
inner join follow f2 on f1.follower = f2.followee
group by f1.follower