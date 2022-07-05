package io.spring.shinyay.graphql.entity

import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String = "",
    val publisher: String = "",
) {
    @ManyToOne(fetch = FetchType.LAZY)
    var author: Author? = null

    constructor(id: Long = 0, title: String = "", publisher: String = "", author: Author? = null) : this(
        id,
        title,
        publisher
    ) {
        this.author = author
    }
}
