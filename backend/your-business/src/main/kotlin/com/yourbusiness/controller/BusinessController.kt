package com.yourbusiness.controller

import com.yourbusiness.dao.BusinessDao
import com.yourbusiness.model.Business
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BusinessController {

    @Autowired
    val businessDao: BusinessDao = BusinessDao()

    @GetMapping("/business/{id}") // GET
    fun getElement(@PathVariable id: String): Business? {
        return businessDao.getElement(id)
    }

    @GetMapping("/business") // GET
    fun getAll(): List<Business> {
        return businessDao.getAll()
    }

    @PutMapping("/business/{id}") // PUT
    fun update(@PathVariable id: String, @RequestBody business: Business) {
        return businessDao.update(id, business)
    }

    @PostMapping("/business") // POST
    fun save(@RequestBody business: Business) {
        return businessDao.save(business)
    }

    @DeleteMapping("/business/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return businessDao.delete(id)
    }

}
