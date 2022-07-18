# Getting Started with GraphQL and Spring Boot

Spring for GraphQL provides support for Spring applications built on GraphQL Java.
Spring for GraphQL aims to be the foundation for all Spring, GraphQL applications.

## Description

### Dependencies

- org.springframework.boot
  - `spring-boot-starter-graphql`
  - `spring-boot-starter-data-web`
  - `spring-boot-starter-data-jpa`

### GraphQL

GraphQL is a query language for your API, and a server-side runtime for executing queries using a type system you define for your data.
GraphQL was created back in 2012 by Facebook. GraphQL was open sourced back in 2015.

- [GraphQL Spec](https://spec.graphql.org/)

### GraphQL Type System

#### Scalar Types

- `Int`: A signed 32-bit integer.
- `Float`: A signed double-precision floating-point value.
- `String`: A UTF-8 character sequence.
- `Boolean`: true or false.
- `ID`: The ID scalar type represents a unique identifier.

#### Operation Types

Query: Used to read data
Mutation: Used to create, update and delete data
Subscription: Similar to a query allowing you to fetch data from the server. Subscriptions offer a long-lasting operation that can change their result over time.

## Demo

### GraphiQL UI
`GraphiQL` is a graphical interactive in-browser GraphQL IDE.
`GraphiQL` is disabled by default so if you would like to use it you will need to open up `application.properties` and enable it with the following property:

```yaml
spring:
  graphql:
    graphiql:
      enabled: true
```

You can access GraphiQL [`http://localhost:8080/graphiql`](http://localhost:8080/graphiql)

#### Query for Authors

This query shows Author ID and Name:

```graphql
query {
  authors {
    id
    name
  }
}
```

#### Query for Books

This query shows Book ID and Title:

```graphql
query {
	books {
    id
    title
  }  
}
```

#### Query for Authors and Books

```graphql
query {
 authors{
   id
   name
   books {
     title
   }
 }
}
```

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References

- [Spring for GraphQL Documentation](https://docs.spring.io/spring-graphql/docs/current-SNAPSHOT/reference/html/)
- [Spring for GraphQL Samples](https://github.com/spring-projects/spring-graphql/tree/main/samples)
- [GraphQL Java](https://www.graphql-java.com/)

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
- twitter: https://twitter.com/yanashin18618
