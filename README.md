# Student Management REST API 🎓

This is a Spring Boot project that provides a **Student Management REST API**.  
It allows you to perform CRUD operations (Create, Read, Update, Delete) on student records using RESTful endpoints.

---

## 🚀 Features
- Add new student records
- Retrieve all students
- Update student details
- Delete student records
- Integrated with MySQL database
- Uses Spring Data JPA for persistence

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**

---

## ▶️ Running the Project
1. Clone the repository:
   bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd student-api


2. Configure your database in `src/main/resources/application.properties`.

3. Run the project:

   bash
   mvn spring-boot:run
 

---

## 📌 API Endpoints

| Method | Endpoint         | Description            |
| ------ | ---------------- | ---------------------- |
| GET    | `/students`      | Get all students       |
| GET    | `/students/{id}` | Get student by ID      |
| POST   | `/students`      | Add a new student      |
| PUT    | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete a student       |

---
## 📸 API Testing Screenshots

### 1. Add Student (POST)
![Add Student](images/Screenshot%202025-08-25%20193843.png)

### 2. Get Students (GET)
![Get Students](images/Screenshot%202025-08-25%20194051.png)

### 3. Update Student (PUT)
![Update Student](images/Screenshot%202025-08-25%20194116.png)

### 4. Delete Student (DELETE)
![Delete Student](images/Screenshot%202025-08-25%20194616.png)


---

## 📂 Project Structure


student-api
 ├── src/main/java/com/preethi/student_api
 │    ├── controller    # REST API endpoints
 │    ├── model         # Student entity
 │    ├── repository    # JPA repository
 │    ├── service       # Business logic
 │    └── StudentApiApplication.java
 ├── src/main/resources
 │    ├── application.properties
 │    └── data.sql
 ├── screenshots        # Postman API screenshots
 └── pom.xml




