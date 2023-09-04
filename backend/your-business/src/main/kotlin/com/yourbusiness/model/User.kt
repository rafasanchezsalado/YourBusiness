package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
import java.util.UUID

@Table(name = "users")
data class User(
    @Id @Column val id: String = UUID.randomUUID().toString().replace("-", ""),
    @Column var username: String = "",
    @Column var password: String = "",
    @Column var name: String = "",
    @Column var birthdate: LocalDate = LocalDate.now(),
    @Column var email: String = "",
    @Column var businessId: String = ""
)