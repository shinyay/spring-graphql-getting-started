package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.repository.BookRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class BookController(val repository: BookRepository) {

    @QueryMapping
    fun members(): MutableList<Author> = repository.findAll()
}
