SELECT s1.* FROM stadium AS s1, stadium AS s2, stadium as s3
    WHERE
    ((s1.id + 1 = s2.id
    AND s1.id + 2 = s3.id)
    OR
    (s1.id - 1 = s2.id
    AND s1.id + 1 = s3.id)
    OR
    (s1.id - 2 = s2.id
    AND s1.id - 1 = s3.id)
    )
    AND s1.people>=100
    AND s2.people>=100
    AND s3.people>=100

    GROUP BY s1.id