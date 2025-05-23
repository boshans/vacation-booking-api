# Vacation Booking API – Back-End Java Final Project

This project was part of my final assessment for the Back-End Programming with Java course at WGU. It’s a Spring Boot application designed to serve as the backend for a travel agency’s vacation booking system.

## ✈️ Overview

The system allows users to:
- Browse vacation packages and excursions
- Submit a booking request through a RESTful API
- Store and validate customer and order data

The front-end was pre-built in Angular and not modified as part of the assignment. The focus was on creating a robust and properly validated back-end service.

## 🧱 Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Lombok
- JSR-303 (Bean Validation)
- REST APIs

## 🔗 Key Components

- **Entities:** Customer, Cart, CartItem, Vacation, Excursion, Division, Country
- **Services:** CheckoutService with UUID-based order tracking
- **Validation:** Full field-level validation using annotations like `@NotBlank`, `@Valid`, etc.
- **Database:** Mapped to pluralized table names, aligned to existing schema

## 📸 Final Submission Requirements

- Order submitted through the Angular front end
- Confirmed database entries in MySQL Workbench
- Screenshot evidence of API and front-end integration

## 📝 Notes

This academic project is presented with permission under WGU guidelines.
