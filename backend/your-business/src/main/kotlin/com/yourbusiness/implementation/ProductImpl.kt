package com.yourbusiness.implementation

import com.yourbusiness.model.Product
import com.yourbusiness.service.ProductService
import org.springframework.stereotype.Repository

@Repository
class ProductImpl(private val productService: ProductService = ProductService()) {

    fun get(id: String): Product? {
        return productService.getProduct(id)
    }

    fun get(): List<Product> {
        return productService.getProducts()
    }

    fun update(productRequest: Product) {
        productService.updateProduct(productRequest)
    }

    fun update(productsList: List<Product>) {
        productService.updateProducts(productsList)
    }

    fun save(productRequest: Product) {
        productService.insertProduct(productRequest)
    }

    fun save(productsList: List<Product>) {
        productService.insertProducts(productsList)
    }

    fun delete(id: String) {
        productService.deleteProduct(id)
    }

    fun delete(productsList: List<Product>) {
        productService.deleteProducts(productsList)
    }

}