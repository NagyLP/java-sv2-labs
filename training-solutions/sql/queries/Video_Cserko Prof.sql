-- CREATE TABLE Customers (
-- id INT,
-- name VARCHAR(100),
-- contact VARCHAR(100),
-- adress VARCHAR(250),
-- city VARCHAR(50),
-- postal_code INT,
-- country VARCHAR(50)
-- );
-- 
-- 
-- SELECT * FROM customers;
-- 
-- SELECT name, city FROM customers;
-- 
-- SELECT DISTINCT country FROM customers;
-- 
-- SELECT DISTINCT country AS 'Ország' FROM customers;
-- 
-- SELECT DISTINCT bela AS 'Ország' FROM customers;
-- 
--  WHERE - Adatok kiválasztása feltételek alapján
-- 
-- 
-- CREATE TABLE Teacher (
-- id INT NOT NULL AUTO_INCREMENT,
-- name VARCHAR(100),
-- position VARCHAR(50),
-- contact VARCHAR(100),
-- city (VARCHAR 50),
-- PRIMARY KEY (id)
-- );
-- 
-- 
-- CREATE TABLE Course (
-- id INT NOT NULL AUTO_INCREMENT,
-- name VARCHAR(50),
-- period VARCHAR(50),
-- level VARCHAR(50),
-- price INT,
-- PRIMARY KEY (id)
-- );
-- 
-- CREATE Table Student (
-- ID INT NOT NULL AUTO_INCREMENT,
-- name VARCHAR (50),
-- city VARCHAR(50),
-- email VARCHAR(50),
-- PRIMARY KEY(ID)
-- );
-- 
-- SELECT*FROM teacher
-- WHERE city = 'Debrecen';
-- 
-- SELECT * FROM student
-- WHERE
-- 		city = 'Budapest'
-- 		AND
-- 		email LIKE '%gmail%';
-- 
-- 
-- 
-- -AND, OR, NOT - FELTÉTELEK
-- 
-- SELECT * FROM teacher
-- WHERE
-- 	id > 1
-- 	AND
-- 	city = 'budapest'
-- 	OR
-- 	city = 'Debrecen'
-- ;
-- 
-- SELECT * FROM student
-- WHERE
-- 	id > 1
-- 	AND
-- 	city = 'Budapest'
-- 	OR
-- 	city = 'Debrecen'
-- ;
-- 
-- 
-- ORDER BY - RENDEZÉS
-- 
-- SELECT * FROM teacher 
-- 	WHERE
-- 		id > 1
-- 		AND
-- 		city = 'Budapest'
-- 		OR
-- 		city = 'Debrecen'
-- 	ORDER BY NAME
-- ;
-- 
-- SELECT * FROM student
-- 	WHERE
-- 		id > 1
-- 		and
-- 		city = 'budapest'
-- 		or
-- 		city = 'debrecen'
-- 	ORDER BY email
-- ;


 
-- MIN & MAX értékek keresése
-- 
-- SELECT MAX(credit) AS MaxCredit
-- 	FROM student 
-- 	WHERE
-- 	city = 'budapest'
-- ;



-- COUNT, AVG, SUM - Meszámlálás, átlagolás, és összegzés
-- 
-- SELECT SUM(credit) AS SumCredit
-- 	FROM student
-- 	WHERE not
-- 	city = 'budapest'
-- ;
-- 
-- SELECT COUNT(id) AS NumTeachers
-- 	FROM teacher
-- 	WHERE city = 'budapest'
-- ;
-- 
-- SELECT COUNT(id) AS Actual
-- 	FROM course
-- 	WHERE period = 'active'
-- ;

-- SELECT--  AVG(credit) AS AvgCredit
-- 	FROM student
-- 	WHERE city = 'budapest'
-- ;



-- GROUP BY - Csoportosítás

/* SÉMA:
SELECT column_name(s)   	// kiválaszt oszlopnevek
FROM table_name				// melyik táblában
WHERE condition				// szűrés kondíciója, alapja
GROUP BY column_name(s)		// csoportosít adat
ORDER BY column_name(s);	// rendez adat
*/

-- SELECT count(id) AS 'Tanulók szám a?', city
-- FROM student
-- GROUP BY city
-- ;



-- LIKE - keresés hasonlóság alapján

/* SELECT column1, column2, ...
FROM table_name
WHERE columnN LIKE pattern;
*/

-- SELECT SUM(credit)
-- FROM student
-- WHERE email LIKE '%gmail%'
-- ;



-- INTO -----
-- 
-- INSERT INTO student
-- 	VALUES
-- 	(6, 'Robert Downey Jr.', 'Manhattan', 'robdow@jr.org'),
-- 	(7, 'Jon Favreau', 'Marie Byrd-föld', 'jf@jf.com'),
-- 	(8, 'Gwyneth Paltrow', 'Északi-sark', 'gp@gp.gp')
-- ;

-- INSERT INTO student (teacher_id)
-- VALUES
-- 		(1),
-- 		(2),
-- 		(3),
-- 		(1);


-- UPDATE - Rekordok frissítése
 /* SÉMA
 
UPDATE table_name
SET name = 'value0', 'value1'  // Kulcs-Érték párok, amelyre változik.
WHERE id = 1
; 					// where feltétel: Rekord azonosítója
WHERE name = 'Jancsi';

*/

-- ALTER TABLE student
-- ADD COLUMN ACTIVE BOOL;

-- UPDATE student
-- SET ACTIVE = 1
-- WHERE ID < 6;   // Nyílt intervallum. 
-- WHERE id <= 4;



-- DELETE - Rekordok törlése

-- DELETE FROM student
-- WHERE id >= 6;



-- JOIN - Táblák összekötése (Inner, Left, Right Full Outer JOIN)

-- SELECT student.id, student.name, student.city, teacher.name, teacher.city
-- FROM teacher 
-- INNER JOIN student ON teacher.id = student.teacher_id
-- ORDER BY teacher.city;

-- ALTER TABLE student
-- ADD COLUMN teacher_id INT;
-- 
-- INSERT INTO student (teacher_id)
-- VALUES
-- 		(1),
-- 		(2),
-- 		(3),
-- 		(1);



-- JOIN megvalósítása összerendelő tábla segítségével

-- SELECT p.*
-- FROM products p  				// alias tábla a "p" (néven)
-- 	JOIN product_to_category ptc ON ptc.product_id = p.id
-- 	JOIN categories c ON c.id = ptc.category_id
-- 		/// WHERE c.id = 1; 			// összes termék ami az 1 kategóriába tartozik.
-- ORDER BY c.id DESC, p.id ASC
-- ;


-- AUTO_INCREMENT - Értékek automatikus növelése
--  INDEX
-- 
-- CREATE TABLE Persons (
--     ID int NOT NULL AUTO_INCREMENT,
--     LastName varchar(255) NOT NULL,
--     FirstName varchar(255),
--     Age int,
--     PRIMARY KEY (ID)
--  );  

-- CREATE INDEX idx_pname
-- ON Persons (LastName, FirstName);

-- ALTER TABLE student AUTO_INCREMENT=100;


-- UNION - Táblák egyesítése
-- 
-- SELECT column_name(s) FROM table1
-- UNION ALL
-- SELECT column_name(s) FROM table2;
-- 

-- SELECT 'Customer' As Type, ContactName, City, Country
-- FROM Customers
-- UNION
-- SELECT 'Supplier', ContactName, City, Country
-- FROM Suppliers;



-- SELECT Sz_Helye AS 'Születési hely',
--      AVG (Fizetés) AS 'A dolgozók átlagfizetése'
-- FROM Dolgozó  GROUP BY Sz_Helye HAVING AVG(Fizetés) <= 120000

