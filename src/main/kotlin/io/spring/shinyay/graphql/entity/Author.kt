package io.spring.shinyay.graphql.entity

import javax.persistence.*

@Entity
data class Author(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val books: List<Book>
)
