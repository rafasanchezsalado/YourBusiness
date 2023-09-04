package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table(name = "business")
data class Business(
    @Id @Column val id: String = UUID.randomUUID().toString().replace("-", ""),
    @Column var name: String = "",
    @Column var colorPrimary: String = "",
    @Column var colorSecondary: String = "",
    @Column var colorTertiary: String = "",
    @Column var colorError: String = "",
    @Column var colorWarning: String = "",
    @Column var colorSuccess: String = "",
)