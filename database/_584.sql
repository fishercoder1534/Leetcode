select c.name from customer c where c.referee_id != 2 or c.referee_id is NULL;

/**MySQL uses three-valued logic -- TRUE, FALSE and UNKNOWN.
Anything compared to NULL evaluates to the third value: UNKNOWN.
That “anything” includes NULL itself!
That’s why MySQL provides the IS NULL and IS NOT NULL operators to specifically check for NULL.
Thus, one more condition 'referee_id IS NULL' should be added to the WHERE clause as below.*/

/**Cool! I'm glad that I figured this one out all by myself! ^ ^*/