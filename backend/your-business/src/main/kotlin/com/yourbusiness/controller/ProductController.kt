package com.yourbusiness.controller

import com.yourbusiness.dao.ProductDao
import com.yourbusiness.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ProductController {

    @Autowired
    val productDao: ProductDao = ProductDao()

    @GetMapping("/products/{id}") // GET
    fun getElement(@PathVariable id: String): Product? {
        return productDao.getElement(id)
    }

    @GetMapping("/products") // GET
    fun getAll(): List<Product> {
        return productDao.getAll()
    }

    @PutMapping("/products/{id}") // PUT
    fun update(@PathVariable id: String, @RequestBody product: Product) {
        return productDao.update(id, product)
    }

    @PostMapping("/products") // POST
    fun save(@RequestBody product: Product) {
        return productDao.save(product)
    }

    @DeleteMapping("/products/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return productDao.delete(id)
    }

}
