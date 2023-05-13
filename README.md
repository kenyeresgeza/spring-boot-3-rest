# Spring Boot 3 REST

Simple overview how to create REST API in Spring Boot 3 and how to use Java record type

## Description

Spring Boot 3, REST, JPA, Java 17

## Getting Started

### Dependencies

* Java 17
* PostgreSQL

### Installing

* Create "sb3" database
* Set java 17
```
sudo update-alternatives --config java (select Java 17)
```
* Build application (you should use gradle 7.3 version)
```
gradle clean bootjar
```

### Executing program

* How to run the program
```
java -jar sb-3-rest-demo-1.0.0.jar
```
* Create customer
```
POST http://localhost:8087/add
{
    "name" : "customer name",
    "email": "customer@mail.com",
    "age": 54
}

```
* Gel all customers
```
GET http://localhost:8087/customers
```

## Author

Kenyeres Géza
https://hu.linkedin.com/in/g%C3%A9za-kenyeres-17341631

