package io.spring.shinyay.graphql.repository

import io.spring.shinyay.graphql.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Int>
