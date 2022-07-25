/*

Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.

The Employee table containing employee data for a company is described as follows:

=========================
| COLUMN      | TYPE    |
=========================
| EMPLOYEE_ID | INTEGER |
-------------------------
| NAMES       | STRING  |
-------------------------
| MONTHS      | INTEGER |
-------------------------
| SALARY      | INTEGER |
-------------------------

where employee_id is an employee's ID number, name is their name, months is the total number of months they've been working for the company, and salary is their monthly salary.

*/

SELECT name FROM Employee ORDER BY name ASC
