/*

Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

The STATION table is described as follows:

=========================
| FIELD       | TYPE    |
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

where LAT_N is the northern latitude and LONG_W is the western longitude.

*/

SELECT city FROM Station WHERE city REGEXP '^[aeiou]'
