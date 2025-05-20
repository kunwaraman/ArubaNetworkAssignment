# Aruba Networks – User Registration Module

This project is a **User Sign-Up Web Application** developed as part of a task for Aruba Networks. The application enables users to register with basic details (name, email, and phone number), performs server-side validation, and stores user data in a MySQL database using Spring Boot and Hibernate.

---

## 🚀 Features

- 🧾 Elegant animated sign-up form (CSS/HTML + Bootstrap)
- ✔️ Real-time form validation (Java Bean Validation / JSR-303)
- 🧠 Backend: Spring Boot with MVC pattern
- 💾 Data persistence using Spring Data JPA and Hibernate
- 🖥️ Thymeleaf template engine for dynamic rendering
- ✅ Regex-based validation for name, email, and phone number

---

## 🛠 Tech Stack

| Layer       | Technology                          |
|-------------|--------------------------------------|
| Frontend    | HTML5, CSS3, Bootstrap, Thymeleaf    |
| Backend     | Spring Boot (v3), Spring MVC         |
| ORM         | Hibernate with Spring Data JPA       |
| Validation  | Jakarta Bean Validation (JSR-303)    |
| Database    | MySQL                                |
| Build Tool  | Maven                                |

---

## 📁 Project Structure

ArubaNetworkAssignment
│
├── controller
│ └── SignUpController.java
│
├── model
│ └── User.java
│
├── repository
│ └── UserRepository.java
│
├── templates
│ └── signup.html
│
├── static
│ └── (CSS and JS files)
│
├── ArubaNetworkAssignmentApplication.java
└── application.properties
