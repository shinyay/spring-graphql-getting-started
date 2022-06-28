package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.entity.Author
import io.spring.shinyay.graphql.repository.MemberRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class MemberController(val repository: MemberRepository) {

    @QueryMapping
    fun members(): MutableList<Author> = repository.findAll()
}
