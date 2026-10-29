# Spring Boot CRUD Operations with MySQL

A simple **CRUD (Create, Read, Update, Delete) REST API** built using Spring Boot, MySQL, and tested with Postman. This project demonstrates how to build RESTful APIs to manage student records and perform database operations.

## 🚀 Features

- Create a new student record
- Retrieve all student records
- Retrieve a student by ID
- Update existing student details
- Delete a student record
- Store and manage data using MySQL
- Test REST APIs using Postman
- Handle HTTP responses using Spring Boot

## 🛠️ Tech Stack

- **Java** – Programming Language
- **Spring Boot** – Backend Framework
- **Spring Web** – REST API Development
- **Spring Data JPA** – Database Operations
- **MySQL** – Relational Database
- **Maven** – Dependency Management
- **Postman** – API Testing
- **IntelliJ IDEA** – Development Environment

## 📂 Project Structure

```text
spring-boot-crud/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/
│       │       ├── controller/
│       │       ├── service/
│       │       ├── repository/
│       │       ├── entity/
│       │       └── SpringBootCrudApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md


*Note: The package names and folder structure may differ in your project.*

## ⚙️ Prerequisites

Make sure you have installed:

- Java JDK
- MySQL Server
- Maven
- Postman
- IntelliJ IDEA or another Java IDE

## 🔧 Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git


Navigate to the project directory:

```bash
cd YOUR_REPOSITORY


### 2. Create the MySQL Database

Open MySQL Workbench or your MySQL terminal and execute:

```sql
CREATE DATABASE student_db;


### 3. Configure MySQL

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Replace the username and password with your MySQL credentials.

**Security tip:** Never upload real database passwords to GitHub.

### 4. Run the Application

Run the main Spring Boot application from your IDE, or execute:

```bash
mvn spring-boot:run


The application will generally start at:

```text
http://localhost:8080


## 📌 API Endpoints

The following endpoints are examples. Update them according to your controller mappings.

| Operation | HTTP Method | Endpoint |
|---|---|---|
| Create Student | POST | `/students` |
| Get All Students | GET | `/students` |
| Get Student by ID | GET | `/students/{id}` |
| Update Student | PUT | `/students/{id}` |
| Delete Student | DELETE | `/students/{id}` |

### 1. Create Student

**Method:** `POST`

**Endpoint:** `http://localhost:8080/students`

Example JSON request body:

```json
{
  "name": "Rahul Kumar",
  "email": "rahul@example.com",
  "course": "B.Tech"
}


### 2. Get All Students

**Method:** `GET`

**Endpoint:** `http://localhost:8080/students`

Returns the list of student records.

### 3. Get Student by ID

**Method:** `GET`

**Endpoint:** `http://localhost:8080/students/1`

Returns the student associated with the specified ID.

### 4. Update Student

**Method:** `PUT`

**Endpoint:** `http://localhost:8080/students/1`

Example JSON request body:

```json
{
  "name": "Rahul Sharma",
  "email": "rahul@example.com",
  "course": "Computer Science"
}


### 5. Delete Student

**Method:** `DELETE`

**Endpoint:** `http://localhost:8080/students/1`

Deletes the student associated with the specified ID.

## 🧪 Testing with Postman

1. Start the Spring Boot application.
2. Open Postman.
3. Select the required HTTP method.
4. Enter the API endpoint.
5. For POST and PUT, select **Body → raw → JSON**.
6. Send the request and verify the response.
7. Check the MySQL database to confirm that the changes were saved.

## 📚 Concepts Learned

- RESTful API development
- CRUD operations
- Spring Boot annotations
- Controller-Service-Repository architecture
- Dependency Injection
- Spring Data JPA
- MySQL database connectivity
- HTTP methods and status codes
- API testing with Postman

## 🔮 Future Improvements

- Add input validation
- Implement global exception handling
- Add pagination and sorting
- Implement Spring Security
- Add Swagger/OpenAPI documentation
- Deploy the application to a cloud platform

## 👨‍💻 Author

**Shivnarayan Chaurasiya**

- GitHub: https://github.com/ShivnarayanChaurasiya
- LinkedIn: https://www.linkedin.com/shivnayanChaurasiya

## ⭐ Support

If you find this project useful, consider giving the repository a star on GitHub.



**Built with Java, Spring Boot, MySQL, and Postman.**
