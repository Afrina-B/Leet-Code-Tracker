-- Last updated: 7/17/2026, 11:56:24 PM
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;