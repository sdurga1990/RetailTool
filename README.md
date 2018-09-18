# RetailTool
Retail store Management 

The purpose of this software is to provide the solution to the retail stores to manage the prices for the purchased items, and improve the businees without manual intervention.  

Getting Started

These instructions will get you know about how to execute and test the project and piece of code provided below which we used in this project. Simply you can download the project in your local machine and open this on eclispse IDE. See deployment for notes on how to deploy the project on a live system.

Prerequisites
- Eclispse IDE latest version is required along with Junit 4.

Please follow below steps in order to test the application,

1) Download the application from the URL "".
2) Create the workspace in local drive, copy and paste the application which you downloaded under this workspace.
3) Open the eclipse and (Eclipse-File-Open project from File.
4) Click the directory and browse the folder where you created the workspace.
5) Right click the project on package explorer and click run as java application or Junit test.
6) D drive should be in your local drive since this will create the customer details for data of joining details, otherwise please change the drive locatio in the method filewriter and filereader from UserasCustomer.java
7) See the output in console.

Break down into end to end tests

Task 1) If the user is an employee of the store, who will get 30% discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
Give an example
double epresult=tu.employeediscountdisplay("10000.0);
assertEquals(7000.0,epresult,0.00);

Task 2) If the user is an affiliated of the store, who will get 10% discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
Give an example
double epresult=tu.affiliated("10000.0");
assertEquals(7000.0,epresult,0.00);

Task 2) If the user is an affiliated of the store, who will get 10% discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
Give an example
double epresult=tu.affiliateddiscountdisplay("20000.0");
assertEquals(18000.0,epresult,0.00);

Task 3) If the customer over 2 year of the store, who will get 5% discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
Give an example
double epresult=uac.filereadr();
assertEquals(9500.0,epresult,0.00);

Task 4) If the bill in $100 then$5 is discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
Give an example
$990 then get $45

Task 5) If the purchese groceries then no discount.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
         
 Task 6) If user can get only one of the percentage based discount on bill.
         Click on Project Explorer, employeediscount.java file and changes the hotcoded value for Input parameter and also Junit fuction arguments for expected result.
