package io.spring.shinyay.graphql.repository

import io.spring.shinyay.graphql.entity.Author
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Author, Int>
