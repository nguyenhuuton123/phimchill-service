# PhimChill Service

## Introduction
PhimChill Service is a web backend application built with Spring Boot, providing APIs for an online movie streaming service. The application is developed using modern technologies and follows best practices in software development.

## Technologies Used
- **Spring Boot 3.1.5**: Main framework for application development
- **Java 17**: Programming language
- **Spring Security**: Authentication and authorization
- **Spring Data JPA**: Data access and management
- **MySQL**: Database management system
- **Flyway**: Database version control
- **JWT (JSON Web Token)**: Authentication management
- **Spring WebSocket**: Real-time communication support
- **Lombok**: Reduce boilerplate code
- **SpringDoc OpenAPI**: Automatic API documentation

## Project Structure
```
src/main/java/com/codegym/phimchill/
├── configuration/    # Application configuration
├── controller/       # Request handling controllers
├── converter/        # Object conversion
├── dto/             # Data Transfer Objects
├── entity/          # JPA entities
├── repository/      # Data access interfaces
├── security/        # Security configuration
├── service/         # Business logic
└── validator/       # Validation logic
```

## System Requirements
- JDK 17 or higher
- MySQL
- Maven/Gradle

## Installation and Running
1. Clone repository:
```bash
git clone https://github.com/nguyenhuuton123/phimchill-service.git
```

2. Configure database in `application.properties`

3. Run the application:
```bash
./gradlew bootRun
```

## API Documentation
API documentation is available at: `http://localhost:8080/swagger-ui.html`

## Main Features
- User management and authorization
- Movie and category management
- Online movie streaming
- Movie search and filtering
- Rating and commenting
- Real-time notifications

## Security
- JWT authentication
- API endpoint security
- Password encryption
- CSRF protection

## Contributing
We welcome contributions from the community! Please read our [Contributing Guidelines](CONTRIBUTING.md) to learn about our development process, how to propose bug fixes and improvements, and how to build and test your changes.

## License
This project is licensed under the [MIT License](LICENSE).
