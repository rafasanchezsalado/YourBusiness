package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.UUID

@Table(name = "operations")
data class Operation(
    @Id @Column val id: String = UUID.randomUUID().toString().replace("-", ""),
    @Column var type: String = "",
    @Column var timestamp: String = Instant.now().toString(),
    @Column var quantity: Int = 0,
    @Column var priceUnit: Double = 0.0,
    @Column var priceTotal: Double = 0.0,
    @Column var amount: Double = 0.0,
    @Column var productId: String = "",
    @Column var userId: String = ""
)