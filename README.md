# SpringBoot-JPA-RestAPI
This is a series on how to setup an E-commerce using Spring boot and related tech stack.

We will start with backend in this series. Setting up microservices, databases and basic features that any e-commerce site has. Later we
will learn how to integrate front-end and backend togather. 

Technologies used: Spring Boot, JPA (Java persistent API), Postgresql (Database), POSTMAN (For API testing)

Spring Boot Initializer : https://start.spring.io/

Initialize your project using the above link.Add following dependencies: Spring Web, Spring Data JPA, PostgreSQL Driver

Then click on generate and your project is ready!!

Download Postgresql (https://www.postgresql.org/download/) and Postman.

You can checkout the annotations,which are used in this project, meaning on: https://springframework.guru/spring-framework-annotations/

Create 3 packages inside src/main/java
com.example.Application.model : This package will contain all the pojo classes that needs to be persisted in the DB.
com.example.Application.controller: It will contain the rest controller.
com.example.Application.repositroy: This package will hold the Jpa repository interface.





