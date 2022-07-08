package io.spring.shinyay.graphql.controller

import io.spring.shinyay.graphql.entity.Author
import io.spring.shinyay.graphql.entity.Book
import io.spring.shinyay.graphql.entity.input.BookInput
import io.spring.shinyay.graphql.repository.BookRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController(val bookRepository: BookRepository) {

    @QueryMapping
    fun books(): MutableList<Book> {
        return bookRepository.findAll()
    }
//    @SchemaMapping(typeName = "Query", value = "books")
//    fun findAllBooks(): MutableList<Book> {
//        return bookRepository.findAll()
//    }

    @MutationMapping
    fun addBook(@Argument bookInput: BookInput): Book {
        val author = Author(name = bookInput.authorName)
        val book = Book(title = bookInput.title, publisher = bookInput.publisher, author = author)
        return bookRepository.save(book)
    }
}
