-- Last updated: 7/17/2026, 11:55:48 PM
SELECT p.product_name,
       s.year,
       s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;