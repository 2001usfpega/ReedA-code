--JOIN examples!!!!

SELECT * FROM album;
SELECT * FROM artist;

--INNER JOIN
--next two lines do the same thing
SELECT * FROM artist a INNER JOIN album b ON a.artistid = b.artistid;
SELECT * FROM artist a, album b WHERE a.artistid = b.artistid;

SELECT COUNT(*) FROM artist a INNER JOIN album b ON a.artistid = b.artistid;

--LEFT OUTER JOIN
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artistid = b.artistid;

SELECT COUNT(*) FROM artist a LEFT OUTER JOIN album b ON a.artistid = b.artistid;

--old way of LEFT OUTER JOIN
SELECT * FROM artist a, album b WHERE a.artistid = b.artistid(+);

--RIGHT OUTER JOIN
SELECT * FROM artist a RIGHT OUTER JOIN album b ON a.artistid = b.artistid;

SELECT COUNT(*) FROM artist a RIGHT OUTER JOIN album b ON a.artistid = b.artistid;

--old way of RIGHT OUTER JOIN
SELECT * FROM artist a, album b WHERE a.artistid(+) = b.artistid;

--FULL OUTER JOIN
SELECT a.name, b.title AS BTitle FROM artist a FULL OUTER JOIN
    album b ON a.artistid = b.artistid;

SELECT * FROM artist a FULL OUTER JOIN album b ON a.artistid = b.artistid;

SELECT COUNT(*) FROM artist a FULL OUTER JOIN album b ON a.artistid = b.artistid;

--LEFT without middle of venndiagram
    --exclusive/distinct/strictly left join
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artistid = b.artistid
    WHERE a.artistid NOT IN(
        SELECT c.artistid FROM artist c INNER JOIN album d
        ON c.artistid = d.artistid
    );
--another way for the above
SELECT * FROM artist a LEFT OUTER JOIN album b ON a.artistid = b.artistid
    WHERE b.artistid IS NULL;

--EXCLUSIVE FULL JOIN
SELECT * FROM artist a FULL OUTER JOIN album b ON a.artistid = b.artistid
    WHERE b.artistid IS NULL OR a.artistid IS NULL;

--SELF JOIN
--SELECT * FROM table01 a INNER JOIN table01 b ON a.id = b.foreignid;

--CROSS/CARTESIAN JOIN
--SELECT * FROM table01 CROSS JOIN table02;












