-- Last updated: 7/17/2026, 11:55:18 PM
SELECT user_id,
       COUNT(follower_id) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;