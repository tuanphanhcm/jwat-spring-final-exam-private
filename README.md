# JWAT Spring Final Exam
## Setup environment
 - [Java JDK 1.8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
 - [Eclipse Enterprise Edition](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2020-03/R/eclipse-inst-win64.exe) with Spring Tool Suite 4 extension or [Spring Tool Suite 4](https://spring.io/tools)
 - ![](src/main/resources/images/Eclipse%20IDE%20EE.png)
 - ![](src/main/resources/images/Spring%20tool%20suite%204.png)
 - [MySql Server Community Edition](https://dev.mysql.com/downloads/)
 - Clone or download this project to your local computer
 - ![](src/main/resources/images/git%20download.png)
 
 - Create database **jwat** then import dataset to table as numberered.
 - ![](src/main/resources/images/dataset.png)
 
 
 - Change dataSource in application.properties with your local database connection
 - ![](src/main/resources/images/application%20properties.png)
 
 - Run Spring Boot App
 - ![](src/main/resources/images/run.png)
 
 - Open browser and go to address http://localhost:8080/swagger-ui.html
 - ![](src/main/resources/images/swagger.png)
 
 - You have been run the project successfully.
 
## Exclusion
 This project is for education purpose only, so we removed some module (security, validate, exception handler...) to simplified the project structure.
 
## Project structure
 Project is build with simple MVC Architecture. **RESTful API** is used to communicate with client.
 
 - **Models**
  - ![](src/main/resources/images/models.png)
 
 - **Physical storage**
  - ![](src/main/resources/images/Cargo%20Line%20ERD.png)
 
 - **Repository layer**
  - ![](src/main/resources/images/Repository.png)
 
 - **Service layer**
  - ![](src/main/resources/images/Service.png)
 
 - **Controller layer**
  - ![](src/main/resources/images/endpoints.png)
 
## Problem 1
 **Design functions help user could:**
 - Register new user
 - Update user's information
 - Delete a user _(you should set IS_DELETED column with value 1 to mark as deleted, never delete a record on the table)_
 - Get list of all users
 
## Problem 2
 **After a certain time of operation, the user need some data for analytics, help them with these function:**
 - Get the list of country which has many users already had shipments, list should be ordered by number of user per country.
 - Get list of top 20 MVP user include fullname, phone, email, city, country and total cost of their shipments.
## Problem 3
