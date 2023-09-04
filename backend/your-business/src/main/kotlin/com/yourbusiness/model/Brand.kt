package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table(name = "brands")
data class Brand(
    @Id @Column val id: String = UUID.randomUUID().toString().replace("-", ""),
    @Column var name: String = ""
)

