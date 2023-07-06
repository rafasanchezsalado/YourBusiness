package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.UUID

@Table(name = "Operations")
data class Operation(@Id @Column val id: String = UUID.randomUUID().toString(),
                     @Column val type: String,
                     @Column val timestamp: String = Instant.now().toString()) {}