# Traini8 Training Center API

This project provides a RESTful API for managing government-funded training centers. It includes functionalities to create new training centers and retrieve a list of all training centers.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
  - [POST /api/training-centers](#post-apitraining-centers)
  - [GET /api/training-centers](#get-apitraining-centers)
- [Validation Rules](#validation-rules)
- [Error Handling](#error-handling)
- [Future Enhancements](#future-enhancements)

## Features

- Create a new training center.
- Retrieve a list of all training centers.
- Basic validation for input fields.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- H2 Database (for in-memory testing)
- Lombok (for reducing boilerplate code)

## Setup Instructions

Follow these steps to set up and run the Traini8 application locally:

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven
- An IDE (like IntelliJ IDEA or Eclipse)

### Step 1: Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone <repository-url>
