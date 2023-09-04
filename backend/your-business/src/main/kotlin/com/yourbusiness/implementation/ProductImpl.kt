package com.yourbusiness.implementation

import com.yourbusiness.model.Product
import com.yourbusiness.service.ProductService
import org.springframework.stereotype.Repository

@Repository
class ProductImpl(productService: ProductService) {

    private val product1: Product = Product(name = "product1", price = 1.0)
    private val product2: Product = Product(name = "product2", price = 2.0)
    private val product3: Product = Product(name = "product3", price = 3.0)
    private val products: ArrayList<Product> = arrayListOf(product1, product2, product3)

    fun getElement(id: String): Product? {
        return products.find { product: Product -> product.id == id }
    }

    fun getAll(): List<Product> {
        return products
    }

    fun update(id: String, productRequest: Product) {
        val product: Product? = products.find { product: Product -> product.id == id }
        products[products.indexOf(product)] = productRequest
    }

    fun save(productRequest: Product) {
        products.add(productRequest)
    }

    fun delete(id: String) {
        products.remove(products.find { product: Product -> product.id == id })
    }

}
