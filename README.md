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

## 📸 API Testing with Postman

Here are some sample screenshots of API testing using Postman:

### 1. Get All Students

![Get All Students](screenshots/get-students.png)

### 2. Add a Student

![Add Student](screenshots/add-student.png)

### 3. Update a Student

![Update Student](screenshots/update-student.png)

### 4. Delete a Student

![Delete Student](screenshots/delete-student.png)

👉 Place your screenshots inside a folder called **`screenshots/`** in the project root.

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




---

✨ Once you paste this, create a folder `screenshots/` later and add your Postman screenshots (with the same names).  

Do you also want me to give you a **shorter version of README** (just summary + endpoints, without Postman) for quick projects where you don’t have screenshots?
```
