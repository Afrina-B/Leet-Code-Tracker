-- Last updated: 7/17/2026, 11:57:40 PM
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);