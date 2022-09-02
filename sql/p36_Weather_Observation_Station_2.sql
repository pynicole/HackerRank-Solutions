/*

Query the following two values from the STATION table:

   1. The sum of all values in LAT_N rounded to a scale of 2 decimal places.
   2. The sum of all values in LONG_W rounded to a scale of 2 decimal places.
   
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

SELECT ROUND(SUM(Lat_N), 2),
ROUND(SUM(Long_W), 2)
FROM Station
