package com.yourbusiness.controller

import com.yourbusiness.dao.BrandDao
import com.yourbusiness.model.Brand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BrandController(@Autowired val brandDao: BrandDao = BrandDao()) {

    @GetMapping("/brands/{id}") // GET
    fun getElement(@PathVariable id: String): Brand? {
        return brandDao.get(id)
    }

    @GetMapping("/brands") // GET
    fun getAll(): List<Brand> {
        return brandDao.get()
    }

    @PutMapping("/brands") // PUT
    fun updateElement(@RequestBody brand: Brand) {
        return brandDao.update(brand)
    }

    @PutMapping("/brands/list") // PUT
    fun updateList(@RequestBody brands: List<Brand>) {
        return brandDao.update(brands)
    }

    @PostMapping("/brands") // POST
    fun saveElement(@RequestBody brand: Brand) {
        return brandDao.save(brand)
    }

    @PostMapping("/brands/list") // POST
    fun saveList(@RequestBody brands: List<Brand>) {
        return brandDao.save(brands)
    }

    @DeleteMapping("/brands/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return brandDao.delete(id)
    }

    @DeleteMapping("/brands") // DELETE
    fun deleteAll(@RequestBody brands: List<Brand>) {
        return brandDao.delete(brands)
    }

}