-- Last updated: 7/17/2026, 11:56:18 PM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description <> 'boring'
ORDER BY rating DESC;