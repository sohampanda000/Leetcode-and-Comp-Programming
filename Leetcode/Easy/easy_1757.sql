/* 1757. Recyclable and Low Fat Products */
/* Write your T-SQL query statement below */
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
