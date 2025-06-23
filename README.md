# TaskManagement

A simple Task Management Web Application built using Java Spring Boot and MongoDB. This project is designed to help users manage their tasks efficiently with features like registration, login, task creation, updating, deletion, and reporting.

✅ Features
🧑 User Registration & Login

✅ Create, Read, Update, Delete (CRUD) Tasks

📝 Add task status (Pending / In Progress / Completed)

📊 Generate task reports

🔐 Basic security with Spring Boot

🌐 RESTful API integration (can be tested using Postman)

💾 MongoDB integration for backend data storage

🚀 Tech Stack
Backend: Java, Spring Boot, Spring Data MongoDB

Database: MongoDB

Testing: Postman (for API testing)

Build Tool: Maven

IDE: Eclipse / IntelliJ

🛠️ How to Run the Project
1. Clone the repository
bash
Copy
Edit
git clone https://github.com/seepaniveenasree/TaskManagement.git
cd TaskManagement
2. Open in your IDE (Eclipse or IntelliJ)
Import as Maven Project

Wait for dependencies to download

3. Configure MongoDB
Make sure MongoDB is installed and running locally (default port: 27017)

Configure MongoDB URI in src/main/resources/application.properties:

properties
Copy
Edit
spring.data.mongodb.uri=mongodb://localhost:27017/taskdb
4. Run the application
Run the main class:
TaskmanagementApplication.java

5. Test APIs using Postman
Base URL: http://localhost:8080/

Examples:

POST /register – Register a new user

POST /login – Login with email and password

POST /task – Create new task

GET /task/all – View all tasks

PUT /task/{id} – Update a task

DELETE /task/{id} – Delete a task

