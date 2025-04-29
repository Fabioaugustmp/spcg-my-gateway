# Spring Cloud Gateway - Base Project

This is a base project using **Spring Cloud Gateway**, designed to be the entry point for routing and handling API requests across microservices. It supports dynamic routing, filtering, and resilience patterns such as circuit breakers.

**Official Documentation**  
https://docs.spring.io/spring-cloud-gateway/reference/index.html

---

## Summary

This project provides a foundational setup for building a centralized API gateway using Spring Cloud Gateway. It enables dynamic and configurable routing to microservices, supports resiliency patterns, and is easily extendable via configuration or code.

---

## Project Features

- Centralized API Gateway for routing
- Load balancing and filtering support
- Circuit breaker integration for fault tolerance
- Extensible and configurable via YAML or Java
- Easy fallback mechanism

---

## Collection to be imported

If you want to use the api postman collection [PostmanCollection](/docs/SPCG-MyGateway.postman_collection.json)
- Download It
- Import into your Postman
- Set the Global Environment Variable (baseURL) -> To your local gateway
- And use it!

## How to run

For more detailed information on how to run this application please [click here!](HELP.md)

## Base Implementation

The image below helps illustrate the flow of the implementation.

![Base Diagram](/docs/base-draw.png)

---

## Add Routes

Define routes in `application.yml`:

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: example-service
          uri: http://localhost:8081
          predicates:
            - Path=/example/**
          filters:
            - StripPrefix=1
```

## Project used as Reference ( Spring WebFlux Reactive Databases Example )

This project demonstrates how to build fully reactive backend applications using **Spring WebFlux** with **reactive databases**.

### Features

- Reactive programming with **Spring WebFlux**
- Integration with:
    - **MongoDB**
    - **PostgreSQL**
    - **Cassandra**
    - **MySql**
    - **R2DBC** (Reactive Relational Database Connectivity)

### Project Repository

Check out the full source code and documentation here:

🔗 [ivangfr/spring-webflux-reactive-databases](https://github.com/ivangfr/spring-webflux-reactive-databases)

