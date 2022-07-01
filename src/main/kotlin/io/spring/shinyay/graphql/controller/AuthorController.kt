package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.entity.Author
import io.spring.shinyay.graphql.repository.AuthorRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AuthorController(val authorRepository: AuthorRepository) {

    @QueryMapping
    fun authors(): Iterable<Author> = authorRepository.findAll()
}
