select name, bonus from Employee 
left join Bonus on Employee.empID=Bonus.empId where bonus<1000 or bonus is null;