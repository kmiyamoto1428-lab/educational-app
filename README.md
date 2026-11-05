●Educational App

★Overview
Educational App is a web application for creating and managing educational lessons.

I am developing this project to improve my skills in Java and backend web development. The application is built with Spring Boot and uses PostgreSQL.

Note: This project is currently under development.

★Features
The application currently includes the following features:

User registration
User login
View a list of lessons
View lesson details
Create new lessons

More features will be added as development continues.

★Technologies
Java
Spring Boot
Spring Security
Thymeleaf
PostgreSQL
Docker
GitHub

★Getting Started
1. Start PostgreSQL with Docker
docker compose up -d
2. Prepare the Application
Before starting Spring Boot, run the following commands:

$env:DB_NAME="educational_app"
$env:DB_USERNAME="postgres"
$env:DB_PASSWORD="my_local_password"
$env:DB_PORT="5433"

3. Start Spring Boot
On Windows:
.\gradlew.bat bootRun

★Application URL
After starting the application, open:
http://localhost:8080/

★Stopping the Application
1. Stop Spring Boot
Press:
Ctrl + C
2. Stop Docker
docker compose down

★PostgreSQL
Connect to PostgreSQL
docker exec -it educational-postgres psql -U postgres -d educational_app

★Show All Tables
\dt

★Show the Structure of the lesson Table
\d lesson

★Exit PostgreSQL
\q

★Future Improvements
This project is still under development. I plan to continue adding new features and improving the application as I learn more about Java and Spring Boot.