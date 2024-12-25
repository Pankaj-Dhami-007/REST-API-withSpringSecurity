# REST API with Spring Boot, MongoDB, Transaction Handling, and Spring Security

## Project Overview
This project demonstrates how to build a RESTful API using Spring Boot. It integrates MongoDB as the database, handles transactions to ensure data consistency, and secures the API using Spring Security. The project is built with Maven, making dependency management easy and allowing it to be scalable and maintainable.

## Key Features
1. **Spring Boot Framework**: Provides an easy way to build and deploy the application.
2. **MongoDB Integration**: MongoDB is used for storing and retrieving data, utilizing its document-based database model.
3. **Transaction Handling**: Ensures data consistency by managing transactions, especially during operations that modify multiple collections.
4. **Spring Security**: Implements authentication and authorization to secure the API endpoints.
5. **Maven for Dependency Management**: Simplifies project setup and management with clear dependencies.

## API Functionalities
- **User Authentication and Authorization**: Users can register, log in, and access protected resources based on their roles.
- **CRUD Operations**: The API supports creating, reading, updating, and deleting resources with proper transaction management.
- **Data Persistence**: All operations interact with MongoDB to store and retrieve data, ensuring efficient handling of large datasets.
- **Secure Endpoints**: Sensitive endpoints are protected using JWT tokens, providing secure access to users.
- **Error Handling**: Proper error responses are returned for failed operations or invalid inputs.

## Technologies Used
- Spring Boot
- MongoDB
- Spring Security
- Maven
- REST API principles
- Transaction management
