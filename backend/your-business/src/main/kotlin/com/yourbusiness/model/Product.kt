package com.yourbusiness.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "products")
data class Product(
    @Id @Column val id: String = UUID.randomUUID().toString().replace("-", ""),
    @Column var name: String = "",
    @Column var description: String = "",
    @Column var price: Double = 0.0,
    @Column var priceDiscounted: Double = 0.0,
    @Column var hasDiscount: Boolean = false,
    @Column var discountPercentage: Int = 0,
    @Column var stock: Int = 0,
    @Column var brand: String = ""
)