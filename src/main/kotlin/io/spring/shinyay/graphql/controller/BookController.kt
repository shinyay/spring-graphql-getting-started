package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.entity.Book
import io.spring.shinyay.graphql.repository.BookRepository
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController(val bookRepository: BookRepository) {

    @SchemaMapping(typeName = "Query")
    fun findAllBooks(): MutableList<Book> {
        return bookRepository.findAll()
    }
}
