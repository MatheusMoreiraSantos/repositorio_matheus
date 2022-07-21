USE sakila;

SELECT title
FROM film
WHERE title REGEXP '^[BHZ]'
ORDER BY title ASC;

SELECT CONCAT(title, " duração de ", (length DIV 60)
, ":", ROUND( ( (length / 60) - (length DIV 60)) * 100,0), "min") as "Filme e duração"
,length AS "tempo em minutos"
FROM film;

SELECT COUNT(*) AS filmes_cadastrados
FROM film;

SELECT title as filme,
		length as duração
FROM film
WHERE length = 90
ORDER BY length ASC;