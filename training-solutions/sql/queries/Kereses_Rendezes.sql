-- SELECT * FROM orszagok
-- WHERE orszag
-- LIKE 'm%'
--  
--  
-- SELECT COUNT(orszag)
-- AS 'Találatok'
-- FROM orszagok
-- WHERE orszag 
-- LIKE 'm%'
-- 
-- 
-- SELECT orszag
-- AS 'Találatok' 
-- FROM orszagok
-- WHERE orszag
-- LIKE 'm%'
-- ORDER BY orszag DESC;
-- 
--
-- SELECT orszag
-- AS 'Találat(ok) ország',
-- terulet
-- AS 'Rendezés: Terület'
-- FROM orszagok
-- WHERE orszag
-- LIKE 'm%'
-- ORDER BY terulet DESC;


-- SELECT * FROM orszagok
-- WHERE terulet = (SELECT MAX(terulet) FROM orszagok);

-- SELECT * FROM orszagok
-- WHERE terulet = (SELECT MAX(terulet) FROM orszagok);

