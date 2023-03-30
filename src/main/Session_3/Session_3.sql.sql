/*Q1*/

select c.customerName, count(o.orderNumber) as cnt
from customers c
inner join orders o
on c.customerNumber = o.customerNumber
group by c.customerName
order by cnt desc
limit 1;

/*Q2*/

select o.customerNumber, d.orderLineNumber, d.orderNumber, d.priceEach, d.productCode, d.quantityOrdered , c.customerName 
from orders o 
inner join orderdetails d 
inner join customers c 
on  o.orderNumber = d.orderNumber 
and o.customerNumber = c.customerNumber 
where c.country="Germany" 
order by customerNumber;

/*Q3*/

select e.employeeNumber, e.firstName , sum(p.amount) as revenue
from employees e 
inner join customers c 
on e.employeeNumber = c.salesRepEmployeeNumber 
inner join payments p 
on c.customerNumber = p.customerNumber 
group by e.employeeNumber;

/*Q4*/

select p.productCode, p.productName 
from products p 
inner join orderdetails d 
on p.productCode=d.productCode 
inner join orders o 
on d.orderNumber = o.orderNumber
where o.orderDate >= 2004-12-01
group by p.productCode;


/*Q5*/
create table employeedetails (
employeeId int (20) NOT NULL,
bankAccount varchar (20) NOT NULL,
address varchar (25) NOT NULL,
phoneNumber int (15) NOT NULL,
opersonalEmail varchar (30) NOT NULL,
PRIMARY KEY (`employeeId`),
CONSTRAINT `employees_details` FOREIGN KEY (`employeeIdemployeedetails`) REFERENCES `employees` (`employeeNumber`)
);
