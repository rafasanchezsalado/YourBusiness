package com.yourbusiness.service

import com.yourbusiness.model.Product
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class ProductService(private val jdbcTemplate: JdbcTemplate = JdbcTemplate()) {

    private val product1: Product = Product(name = "product1")
    private val product2: Product = Product(name = "product2")
    private val product3: Product = Product(name = "product3")
    private val products: ArrayList<Product> = arrayListOf(product1, product2, product3)

    fun getProduct(id: String): Product {
        return products[Integer.valueOf(id)]
    }

    fun getProducts(): List<Product> {
        return products
    }

    fun insertProduct(productRequest: Product) {
        products.add(productRequest)
    }

    fun insertProducts(productsList: List<Product>) {
        // TODO
    }

    fun updateProduct(productRequest: Product) {
        // TODO
    }

    fun updateProducts(productsList: List<Product>) {
        // TODO
    }

    fun deleteProduct(id: String) {
        // TODO
    }

    fun deleteProducts(productsList: List<Product>) {
        // TODO
    }

    /*
    fun getProduct(id: String): Product = db.query("select*  from messages where id = ?") { response, _ ->
        Product(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }[0]


    fun getProduct(id: String): Product {
        return db.queryForObject("select  *from messages where id = ?", Product::class.java, id)
    }

    fun getProducts(): List<Product> = db.query("select*  from products") { response, _ ->
        Product(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }

    fun insertProduct(id: String, name: String) {
        db.update("insert into products values ( ?, ? )", id, name)
    }

    fun updateProduct(id: String, name: String) {
        db.update("update products set name = ? where id = ?", name, id)
    }


    fun deleteProduct(id: String) {
        db.update("delete * from products where id = ?", id)
    }
    */

}