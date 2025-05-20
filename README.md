Overview
This project is a responsive sign-up form for Aruba Networks, built with Spring Boot (Java) for the backend and Thymeleaf with Bootstrap for the frontend. It includes form validation, database persistence, and a modern UI design.

Features
Backend
Spring Boot MVC architecture

JPA/Hibernate for database operations

Form validation with Jakarta Validation:

Name: letters and spaces only

Email: valid email format

Phone: 10-15 digits

MySQL database integration (configurable)

Frontend
Responsive design with Bootstrap5

Animated background with gradient effects

Client-side validation with JavaScript

Success message after form submission

Modern UI with Aruba Networks branding

Technologies Used
Backend:

Java 17

Spring Boot 3.x

Spring Data JPA

MySQL Driver

Thymeleaf

Frontend:

HTML5

CSS3 (with animations)

Bootstrap 5.3

Font Awesome 6

Thymeleaf templates

Setup Instructions
Prerequisites
Java 17 JDK

Maven 3.8+

MySQL 8.0+

IDE  (intellijIdea)

Installation
Clone the repository:

bash
git clone https://github.com/yourusername/aruba-signup.git
Configure MySQL:

Create a database named aruba_signup

Update application.properties with your credentials:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/aruba_signup
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
Build and run:

bash
mvn spring-boot:run
Access the application at:

http://localhost:8080/signup
Project Structure
src/
├── main/
│   ├── java/
│   │   └── ArubaNetworkAssignment/
│   │       └── SignUpWork/
│   │           ├── Controller/        # Spring MVC controllers
│   │           ├── Model/             # Entity classes
│   │           └── Repository/        # Data access layer
│   └── resources/
│       ├── static/                    # Static assets
│       ├── templates/                 # Thymeleaf templates
│       └── application.properties     # Configuration
└── test/                              # Test cases
Validation Rules
Field	Validation Criteria	Error Message
Name	Not blank, letters and spaces only	"Name can only contain letters and spaces"
Email	Not blank, valid email format	"Please enter a valid email address"
Phone	Not blank, 10-15 digits	"Phone number must be 10-15 digits"
Future Enhancements
Add email verification

Implement password authentication

Add OAuth login options

Include CAPTCHA verification

Develop admin dashboard for user management
