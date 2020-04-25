SELECT question_id AS 'survey_log' FROM survey_log GROUP BY question_id ORDER BY
COUNT(answer_id) / COUNT(case when survey_log.action =
 'show' then survey_log.action else null end) DESC LIMIT 0,1