# User Consultation CRUD Application

This project is a Spring Boot application that provides a CRUD interface for user consultations. It allows users to create, read, update, and delete user information.

## Project Structure

```
user-consultation-crud
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── userconsultation
│   │   │               ├── UserConsultationApplication.java
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── model
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   └── UserRepository.java
│   │   │               └── service
│   │   │                   └── UserService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd user-consultation-crud
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application:**
   ```
   mvn spring-boot:run
   ```

4. **Access the API:**
   The application will be running on `http://localhost:8080`. You can use tools like Postman or curl to interact with the API.

## Usage Guidelines

- **Create User:** Send a POST request to `/users` with user details in the request body.
- **Get User:** Send a GET request to `/users/{id}` to retrieve user information.
- **Update User:** Send a PUT request to `/users/{id}` with updated user details in the request body.
- **Delete User:** Send a DELETE request to `/users/{id}` to remove a user.

## Dependencies

This project uses the following dependencies:
- Spring Boot
- Spring Data JPA
- H2 Database (for in-memory database during development)

## License

This project is licensed under the MIT License.