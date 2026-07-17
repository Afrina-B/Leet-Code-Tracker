-- Last updated: 7/17/2026, 11:55:37 PM
SELECT eu.unique_id,
       e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;