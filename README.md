# TravelPlanner

A simple web application for managing travel destinations.

## Features

* Add destinations
* View all destinations
* Search destinations by name or country
* Sort destinations by name or country
* Edit destinations
* Delete destinations
* Basic form validation

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* HTML
* CSS
* JavaScript
* Maven

## How It Works

The backend is built with Spring Boot and provides REST API endpoints for managing destinations.

PostgreSQL is used to store the destination data, and Spring Data JPA is used to communicate with the database.

The frontend is a static HTML page with CSS and JavaScript that communicates with the backend API.

## Running the Project

1. Make sure PostgreSQL is installed and running.
2. Create a PostgreSQL database named `travelplanner`.
3. Set the `DB_PASSWORD` environment variable to your PostgreSQL password.
4. Open the project in IntelliJ IDEA.
5. Run the Spring Boot application.
6. Open `http://localhost:8080` in your browser.

## Project Structure


src/
├── main/
│   ├── java/
│   │   └── com.travelplanner/
│   │       ├── controller/
│   │       ├── model/
│   │       └── repository/
│   └── resources/
│       ├── static/
│       └── application.properties
└── test/


## Author

Student project built as a learning project using Spring Boot and PostgreSQL.
