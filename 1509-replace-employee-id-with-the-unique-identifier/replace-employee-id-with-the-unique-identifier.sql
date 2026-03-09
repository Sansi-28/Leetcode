# Write your MySQL query statement below
SELECT unique_id, name FROM Employees E LEFT JOIN EmployeeUNI F ON E.id = F.id;