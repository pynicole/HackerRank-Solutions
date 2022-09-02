/*  

We define an employee's total earnings to be their monthly salary * months worked, and the maximum total earnings to be the maximum total earnings for any employee in the Employee table. 
Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. 
Then print these values as 2 space-separated integers.

The Employee table containing employee data for a company is described as follows: 

=========================
| COLUMN      | TYPE    |
=========================
| EMPLOYEE_ID | INTEGER |
-------------------------
| NAME        | STRING  |
-------------------------
| MONTHS      | INTEGER |
-------------------------
| SALARY      | INTEGER |
-------------------------

*/

SELECT MAX(Salary*Months),
COUNT(Employee_ID)
FROM Employee
GROUP BY Salary*Months
ORDER BY Salary*Months DESC
LIMIT 1
