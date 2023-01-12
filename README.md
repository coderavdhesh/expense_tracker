# Expense Tracker, Spring boot and MySQL Web Applicaton
A simple expense tracking application built with Angular 9 and Spring boot that connects to the MySQL database. Application built using spring data JPA to perform database operations. Users can add, list, update, delete, sort, and filter the expenses.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

4. Springboot - 2.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/coderavdhesh/expense_tracker.git
```

**2. Create Mysql database**
```bash
create database expensetracker
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven (expensetracker)**

```bash
java -jar target/expense_tracker.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:7001>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /expenses
    
    POST /expenses
    
    GET /expenses/{expenseId}
    
    DELETE /expenses/{expenseId}

You can test them using postman or any other rest client.

Alternatively, you can run the below command to open the application in default web browser -


## Learn more
