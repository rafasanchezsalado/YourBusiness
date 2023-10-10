package com.yourbusiness.controller

import com.yourbusiness.dao.ProductDao
import com.yourbusiness.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ProductController(@Autowired val productDao: ProductDao = ProductDao()) {

    @GetMapping("/products/{id}") // GET
    fun getElement(@PathVariable id: String): Product? {
        return productDao.get(id)
    }

    @GetMapping("/products") // GET
    fun getAll(): List<Product> {
        return productDao.get()
    }

    @PutMapping("/products") // PUT
    fun updateElement(@RequestBody product: Product) {
        return productDao.update(product)
    }

    @PutMapping("/products/list") // PUT
    fun updateList(@RequestBody products: List<Product>) {
        return productDao.update(products)
    }

    @PostMapping("/products") // POST
    fun saveElement(@RequestBody product: Product) {
        return productDao.save(product)
    }

    @PostMapping("/products/list") // POST
    fun saveList(@RequestBody products: List<Product>) {
        return productDao.save(products)
    }

    @DeleteMapping("/products/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return productDao.delete(id)
    }

    @DeleteMapping("/products") // DELETE
    fun deleteAll(@RequestBody products: List<Product>) {
        return productDao.delete(products)
    }

}