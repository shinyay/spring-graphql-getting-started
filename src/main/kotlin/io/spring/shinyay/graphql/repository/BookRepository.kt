package io.spring.shinyay.graphql.repository

import io.spring.shinyay.graphql.entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Int>
