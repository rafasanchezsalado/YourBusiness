package com.yourbusiness.dao

import com.yourbusiness.implementation.ProductImpl
import com.yourbusiness.model.Product
import com.yourbusiness.service.ProductService
import org.springframework.jdbc.core.JdbcTemplate

class ProductDao : Dao<Product> {

    private val productImpl: ProductImpl = ProductImpl(ProductService(JdbcTemplate()))

    override fun getElement(id: String): Product? {
        return productImpl.getElement(id)
    }

    override fun getAll(): List<Product> {
        return productImpl.getAll()
    }

    override fun update(id: String, obj: Product) {
        productImpl.update(id, obj)
    }

    override fun save(obj: Product) {
        productImpl.save(obj)
    }

    override fun delete(id: String) {
        productImpl.delete(id)
    }

}


