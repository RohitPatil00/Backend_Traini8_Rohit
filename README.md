# Traini8 Training Center API

This project provides a RESTful API for managing government-funded training centers. It includes functionalities to create new training centers and retrieve a list of all training centers.

## Table of Contents

- Features
- Technologies Used
- Setup Instructions
- API Endpoints
  - POST /api/training-centers
  - GET /api/training-centers
- Validation Rules
- Error Handling
- Future Enhancements

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

git clone <repository-url>

### Step 2: Navigate to the Project Directory

Change into the project directory:

cd <project-directory>

### Step 3: Build the Project

Use Maven to build the project:

mvn clean install

### Step 4: Run the Application

You can run the application directly from your IDE or using the following command:

mvn spring-boot:run

The application will start on port 8080 by default.

### Step 5: Access the API

Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

## API Endpoints

### POST /api/training-centers

This endpoint allows you to create a new training center.

- Request Body:
{
    "name": "Example Training Center",
    "address": "123 Example St, Example City, Example State, 123456"
}

- Response:
{
    "id": 1,
    "name": "Example Training Center",
    "address": "123 Example St, Example City, Example State, 123456"
}

### GET /api/training-centers

This endpoint retrieves a list of all training centers.

- Response:
[
    {
        "id": 1,
        "name": "Example Training Center",
        "address": "123 Example St, Example City, Example State, 123456"
    }
]

## Validation Rules

- name: Required, must be less than 40 characters.
- address: Required.

## Error Handling

The application includes basic error handling that returns appropriate messages for validation failures. This is managed through a centralized exception handler.

## Future Enhancements

- Implement filtering for the GET endpoint.
- Add more fields to the training center model.
- Improve the user interface for API testing.
