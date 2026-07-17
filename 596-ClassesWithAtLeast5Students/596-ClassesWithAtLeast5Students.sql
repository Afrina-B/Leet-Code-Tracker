-- Last updated: 7/17/2026, 11:56:23 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;