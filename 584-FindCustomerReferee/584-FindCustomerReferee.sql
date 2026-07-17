-- Last updated: 7/17/2026, 11:56:27 PM
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;