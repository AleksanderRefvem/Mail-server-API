# Mail API service
This project gives an API for a Mail Service including basic CRUD-operations.

## Table of Contents
1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Contact](#contact)

## Introduction
Provide a more detailed introduction to the project, including its purpose, goals, and any relevant background information.


This project was an assignment in Object programming 2 (OBJ2100) from the University of Sout-East Norway (USN),
Campus Ringerike.
The goal of the assignment was to get to know how API's work using Java, Spring Web,
Spring Data JPA, and PostgreSQL. Personally this is the first time I've worked with an API.

## Installation
1. Install PostgreSQL and create a new database. No need to add tables.

2. Install Lombok plug-in then copy and paste the following in the pom.xml file within "dependencies":

```
<dependency>
<groupId>org.springdoc</groupId>
<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
<version>2.3.0</version>
</dependency>
```
```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.22</version> <!-- Use the latest version available -->
    <scope>provided</scope>
</dependency>
```
3. In the "application.properties" file under the "resources" map
copy and paste the following (configure correct database URL, username and password):

```
spring.datasource.url= jdbc:postgresql://localhost:5432/Mail_Server
spring.datasource.username= postgres
spring.datasource.password= your_password

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update
```
4. Run the application in your IDE of choosing.
5. Open the following link in your web browser: http://localhost:8080/swagger-ui/index.html
6. You should now see different CRUD methods you can use for your database. Use GET to retrieve data,
POST to create data, DELETE for deletion and PUT for updating data.

## Contact
LinkedIn: Aleksander Refvem