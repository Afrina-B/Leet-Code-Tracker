-- Last updated: 7/17/2026, 11:57:42 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;