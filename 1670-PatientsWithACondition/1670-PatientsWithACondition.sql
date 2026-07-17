-- Last updated: 7/17/2026, 11:55:34 PM
SELECT *
FROM Patients
WHERE conditions LIKE 'DIAB1%'
   OR conditions LIKE '% DIAB1%';