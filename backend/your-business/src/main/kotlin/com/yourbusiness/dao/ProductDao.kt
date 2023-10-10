package com.yourbusiness.dao

import com.yourbusiness.implementation.ProductImpl
import com.yourbusiness.model.Product

class ProductDao(private val productImpl: ProductImpl = ProductImpl()) : Dao<Product> {

    override fun get(id: String): Product? {
        return productImpl.get(id)
    }

    override fun get(): List<Product> {
        return productImpl.get()
    }

    override fun update(obj: Product) {
        productImpl.update(obj)
    }

    override fun update(list: List<Product>) {
        productImpl.update(list)
    }

    override fun save(obj: Product) {
        productImpl.save(obj)
    }

    override fun save(list: List<Product>) {
        productImpl.save(list)
    }

    override fun delete(id: String) {
        productImpl.delete(id)
    }

    override fun delete(list: List<Product>) {
        productImpl.delete(list)
    }

}