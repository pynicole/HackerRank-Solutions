/*

Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345. 
Round your answer to 4 decimal places.

The STATION table is described as follows:
   
=========================
| FIELD  | TYPE         |
=========================
| ID     | NUMBER       |
-------------------------
| CITY   | VARCHAR2(21) |
-------------------------
| STATE  | VARCHAR2(2)  |
-------------------------
| LAT_N  | NUMBER       |
-------------------------
| LONG_W | NUMBER       |
-------------------------

*/

SELECT ROUND(LONG_W, 4)
FROM Station
WHERE LAT_N<137.2345
ORDER BY LAT_N DESC
LIMIT 1
