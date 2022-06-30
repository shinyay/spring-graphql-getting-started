package io.spring.shinyay.graphql

import io.spring.shinyay.graphql.entity.Author
import io.spring.shinyay.graphql.repository.AuthorRepository
import io.spring.shinyay.graphql.repository.BookRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringAppApplication {

	@Bean
	fun applicationRunner(authorRepository: AuthorRepository, bookRepository: BookRepository) =
		ApplicationRunner {
			val josh = authorRepository.save(Author(name = "Josh Long"))
			val mark = authorRepository.save(Author(name ="Mark Heckler"))
		}
}

fun main(args: Array<String>) {
	runApplication<SpringAppApplication>(*args)
}
