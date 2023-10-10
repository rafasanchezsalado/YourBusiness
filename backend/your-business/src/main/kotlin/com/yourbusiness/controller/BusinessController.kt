package com.yourbusiness.controller

import com.yourbusiness.dao.BusinessDao
import com.yourbusiness.model.Business
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BusinessController(@Autowired val businessDao: BusinessDao = BusinessDao()) {

    @GetMapping("/business/{id}") // GET
    fun getElement(@PathVariable id: String): Business? {
        return businessDao.get(id)
    }

    @GetMapping("/business") // GET
    fun getAll(): List<Business> {
        return businessDao.get()
    }

    @PutMapping("/business") // PUT
    fun updateElement(@RequestBody business: Business) {
        return businessDao.update(business)
    }

    @PutMapping("/business/list") // PUT
    fun updateList(@RequestBody business: List<Business>) {
        return businessDao.update(business)
    }

    @PostMapping("/business") // POST
    fun saveElement(@RequestBody business: Business) {
        return businessDao.save(business)
    }

    @PostMapping("/business/list") // POST
    fun saveList(@RequestBody business: List<Business>) {
        return businessDao.save(business)
    }

    @DeleteMapping("/business/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return businessDao.delete(id)
    }

    @DeleteMapping("/business") // DELETE
    fun deleteAll(@RequestBody business: List<Business>) {
        return businessDao.delete(business)
    }

}
