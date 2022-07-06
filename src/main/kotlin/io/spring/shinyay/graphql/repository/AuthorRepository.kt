package io.spring.shinyay.graphql.repository

import io.spring.shinyay.graphql.entity.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long> {

    fun findAuthorByName(name: String): List<Author>

}
