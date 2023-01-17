# Expense Tracker, Spring boot and MySQL Web Application
A backend of a web application, It helps us to track, manage and calculate expenses, built on Spring boot that connects to the MySQL database in real-time. Application built using Spring Data JPA to perform database CRUD operations. Users can add, retrieve, update and delete their expenses to track them.

## Requirements

1. Java - 17

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
create database expense_tracker
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

+ we can also update/change the server port number by uptating server.port={...change the port number...}

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

-----------------------------------------------------------------------------------------------
                    Know More about "Expense Tracker Web Application"
-----------------------------------------------------------------------------------------------
Project Name : Expense Tracker Web app backend service development 
Project aim : This API helps to fatch data and also performed CRUD operations to make our website/apps updated with the correct DataSets.
-----------------------------------------------------------------------------------------------
                                How this API works ? 
Web requests and URLs which helps to perform Get/Post/Put/Delete [CRUD operations] --
Note : you can use Postman or any rest client to hit these all URLs.

1. Create [Post] : 
    -> 'localhost:7001/expenses', it helps to Create expense dataset in our database.

2. Retrieve [Get] : 
    -> 'localhost:7001/expenses', it helps to retrieve datasets all your expenses from our database.
    -> 'localhost:7001/expenses/{id}', it is a Dynamic request, helps to retrieve dataset of a spacific expense of the passed Id from our database.

3. Update [Put] :
    -> 'localhost:7676/expense/{id}', it is also a Dynamic request, helps to update the already existing datasets in our database.

4. Delete [Delete] :
    -> 'localhost:7676/books/{id}', it is also a Dynamic request, helps to Delete the already existing datasets in our database.
    
-----------------------------------------------------------------------------------------------
                                    Key Learnings:
1. How the Things are actually working in Backend.
2. Familiar with SpringBoot-Architectural Layers and how they are working together to get the
   data from database to the end user.
3. How we can connect our API with our Database with the help of JPA and perform the CRUDs on 
   your API.
4. Get familiar with the CRUD methonds of JPA repo and Database configrations.
5. How we can test/cheack the working of our backend service/APIs with 'POSTMAN TOOL'
6. More clearity in core Java concepts.
-----------------------------------------------------------------------------------------------
                            Used Tools and other Services: 
1. Postman API tool to get the reponses.
2. MySQL server and Interaction with database through terminal.
3. VS code to manage this project
4. Git(github) to upload this source Code
5. No frontend written yet for this API.
-----------------------------------------------------------------------------------------------
