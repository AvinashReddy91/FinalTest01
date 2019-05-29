/******** Developer:: Avinash Reddy Madadi *******/

#MASHREQ DIGITAL account POC project

This is maven project, import this project as maven project in eclipse IDE

I have developed a cucumber frame work. A cucumber is a tool based on Behavior Driven Development (BDD) framework which is used to write acceptance tests for the web application. It allows automation of functional validation in easily readable and understandable format (like plain English) to Business Analysts, Developers, Testers, etc.

/********* Project Folder Structure ********/

In src/test/java we have pages, step definitions, utilities and test runner packages.
In src/test/resources we have features files and properties.

Feature file: Here we will write the acceptance criteria tests in user understandable format (like plain English).

Pages: Here i am capturing the web elements and created pages files for each web page. Also I have implemented actions on that elements in pages.

Step definitions: In Step definitions we have code for business logic for the steps designed in feature files.

utilities: All common/ generic functions are available here.

Properties: Here we are passing config details like browser name, application name, etc.

test runner: To execute the scripts we will run this file as " run as junit file".

reports: In reports folder, we will have extent reports. After the running the scripts reports will be published to this folder in html format.


/********* execution steps********/

Open the "TestRunner" class and provide the tag details. To execute the 2 scenarios, we need pass the parent tag "@MASHREQBankTestSuite". To execute the 1st scenario only we need to pass the "@TestCase01" and to execute the 2nd scenario we need to pass "@TestCase02" tag.