package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table(name = "Users")
data class User(@Id @Column val id: String = UUID.randomUUID().toString(),
                @Column val username: String,
                @Column val password: String,
                @Column val name: String,
                @Column val email: String,
                @Column val business: Business) {}