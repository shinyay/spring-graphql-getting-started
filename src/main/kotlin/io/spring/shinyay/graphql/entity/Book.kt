package io.spring.shinyay.graphql.entity

import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String = "",
    val publisher: String = "",
    @ManyToOne(fetch = FetchType.LAZY)
    val author: Author? = null
    )
