DELETE p1 FROM Person p1 INNER JOIN Person p2
WHERE p1.Email = p2.Email AND p1.Id > p2.Id;

DELETE FROM Person WHERE ID NOT IN 
(SELECT * FROM (SELECT MIN(Id) FROM Person p GROUP BY Email) t);