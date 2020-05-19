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

