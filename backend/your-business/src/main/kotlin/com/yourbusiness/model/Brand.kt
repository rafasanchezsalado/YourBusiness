package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "brands")
data class Brand(
    @Id val id: String = UUID.randomUUID().toString().replace("-", ""),
    var name: String = ""
)