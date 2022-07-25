/*

Query all columns for a city in CITY with the ID 1661.

The CITY table is described as follows:

==============================
| FIELD       | TYPE         |
==============================
| ID          | NUMBER       |
------------------------------
| NAME        | VARCHAR2(17) |
------------------------------
| COUNTRYCODE | VARCHAR2(3)  |
------------------------------
| DISTRICT    | VARCHAR2(20) |
------------------------------
| POPULATION  | NUMBER       |
------------------------------

*/

SELECT * FROM City WHERE id=1661
