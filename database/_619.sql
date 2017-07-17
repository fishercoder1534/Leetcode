SELECT MAX(num) AS num
FROM
(SELECT num FROM number
GROUP BY num
HAVING COUNT(num) = 1) AS t;