package io.spring.shinyay.graphql.repository

import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Author, Int>
