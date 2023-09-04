package com.yourbusiness.controller

import com.yourbusiness.dao.BrandDao
import com.yourbusiness.model.Brand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BrandController {

    @Autowired
    val brandDao: BrandDao = BrandDao()

    @GetMapping("/brands/{id}") // GET
    fun getElement(@PathVariable id: String): Brand? {
        return brandDao.getElement(id)
    }

    @GetMapping("/brands") // GET
    fun getAll(): List<Brand> {
        return brandDao.getAll()
    }

    @PutMapping("/brands/{id}") // PUT
    fun update(@PathVariable id: String, @RequestBody brand: Brand) {
        return brandDao.update(id, brand)
    }

    @PostMapping("/brands") // POST
    fun save(@RequestBody brand: Brand) {
        return brandDao.save(brand)
    }

    @DeleteMapping("/brands/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return brandDao.delete(id)
    }

}