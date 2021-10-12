------------------------------------------------------ Introduction --------------------------------------------------------------------
This application is a simple model Spring boot with Kottlin application built with Spring.io tuturials as a reference
This application uses mustache customized by Spring boot framework for rendering views.
The beauty of this application lies in its test cases whose naming conventions are very unique.
This application is built on in memory database h2 and an application initializer runs when the Spring boot application is loaded to insert data in the database.
For each instance of running of this application a new dynamic h2 database name is created.
The application is built using Gradle as a build tool which allows us to see how we can build Spring boot based kotlin application using Gradle.
The Same application can be built using Maven if we want but we will need to write our pom.xml using the same dependencies which we have in gradle.
There are two Controllers 1) Http Controller prints results in plain Json, 2) The HtmlController - prints or renders the results using Mustache template.
------------------------------------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------- Instruction to Run the Application ----------------------------------------------------
Download the zip from the Onedrive or clone the application from Git.
Import the application in IDE, intellij preferrably - build and run the application using the Spring boot application file
We can also run the application using gradle commandline and spring boot plugin commands.
Please run the testcases separately, debug the code and check how it works.
Will advise we debug the application while running it to understand the logic and how the application works.
------------------------------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------ Note ------------------------------------------------------------------------------
There are few Web MVC related test cases that has to be written - which is a TO DO.
-------------------------------------------------------------------------------------------------------------------------------------------------



