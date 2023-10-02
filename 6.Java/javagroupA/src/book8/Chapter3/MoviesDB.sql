select * from movie;

SELECT title, year
FROM movie
ORDER BY year;

SELECT * FROM movie ORDER BY year;

SELECT title, year
FROM movie
WHERE year <= 1980
ORDER BY year DESC;

SELECT title, year
FROM movie 
WHERE year < 1970 or year > 1979
ORDER BY year DESC;

SELECT id,title,year 
FROM movie
WHERE id=7;

SELECT id,title,year 
FROM movie
WHERE title like "%princess%";

SELECT count(*) as count, min(year), max(year) from movie;

CREATE TABLE friend (
 lastname varchar(50),
 firstname varchar(50),
 movieid int
);

INSERT INTO friend (lastname, firstname, movieid)
VALUES("Haskell", "Eddie", 3);
INSERT INTO friend (lastname, firstname, movieid)
VALUES ("Haskell", "Eddie", 5);
INSERT INTO friend (lastname, firstname, movieid)
VALUES ("Cleaver", "Wally", 9);
INSERT INTO friend (lastname, firstname, movieid)
VALUES("Mondello", "Lumpy", 2);
INSERT INTO friend (lastname, firstname, movieid)
VALUES("Cleaver", "Wally", 3);
 
SELECT lastname, firstname, title
FROM movie, friend
WHERE movie.id = friend.movieid;

SELECT title from movie, friend
WHERE movie.id = friend.movieid
AND lastname = "Haskell";

SELECT  DISTINCT lastname, firstname from friend;

SELECT * FROM  movie;
DELETE FROM movie
WHERE id = 10;

SELECT * FROM friend;
use movies;
DELETE FROM friend 
WHERE lastname = "Haskell";


 




