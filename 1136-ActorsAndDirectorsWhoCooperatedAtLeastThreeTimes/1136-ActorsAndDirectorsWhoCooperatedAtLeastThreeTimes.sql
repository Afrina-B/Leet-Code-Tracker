-- Last updated: 7/17/2026, 11:55:50 PM
SELECT actor_id,
       director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;