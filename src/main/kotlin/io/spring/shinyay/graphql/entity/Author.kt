package io.spring.shinyay.graphql.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Author(
    @Id
    @GeneratedValue
    val id: Long
)
