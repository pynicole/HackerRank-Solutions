/*

Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.

The OCCUPATIONS table is described as follows:

=======================
| COLUMN     | TYPE   |
=======================
| Name       | STRING |
-----------------------
| Occupation | STRING |
-----------------------

*/


SELECT 
    MIN(CASE WHEN Occupation = 'Doctor'      THEN Name ELSE NULL END) ,
    MIN(CASE WHEN Occupation = 'Professor'   THEN Name ELSE NULL END) ,
    MIN(CASE WHEN Occupation = 'Singer'      THEN Name ELSE NULL END) ,
    MIN(CASE WHEN Occupation = 'Actor'       THEN Name ELSE NULL END)
FROM
(SELECT Occupation, Name, ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) AS Temp
FROM Occupations) AS T
GROUP BY Temp
