-- Last updated: 7/17/2026, 11:55:44 PM
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;