/*

Query the Name of any student in STUDENTS who scored higher than 75 Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.

=========================
| COLUMN | TYPE         |
=========================
| ID     | NUMBER       |
-------------------------
| NAME   | VARCHAR2(21) |
-------------------------
| MARKS  | VARCHAR2(2)  |
-------------------------

The STUDENTS table is described as follows:  The Name column only contains uppercase (A-Z) and lowercase (a-z) letters.

*/

SELECT name FROM Students WHERE marks > 75 ORDER BY RIGHT(NAME,3), ID
