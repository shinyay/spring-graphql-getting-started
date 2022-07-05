package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.entity.Author
import io.spring.shinyay.graphql.entity.Book
import io.spring.shinyay.graphql.repository.AuthorRepository
import io.spring.shinyay.graphql.repository.BookRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class AuthorController(val authorRepository: AuthorRepository, val bookRepository: BookRepository) {

    @QueryMapping
    fun authors(): Iterable<Author> = authorRepository.findAll()

    @QueryMapping
    fun authorById(@Argument id: Long): Optional<Author> {
        return authorRepository.findById(id)
    }

    @MutationMapping
    fun addBook(@Argument bookInput: BookInput): Book {
        val author = authorRepository.findById(bookInput.authorId).orElseThrow()
        val book = Book(title = bookInput.title, publisher = bookInput.publisher, author = author)
        return bookRepository.save(book)
    }
}

data class BookInput(val title: String, val publisher: String, val authorId: Long)
