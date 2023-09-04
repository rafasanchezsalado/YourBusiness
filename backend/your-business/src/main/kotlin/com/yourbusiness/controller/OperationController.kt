package com.yourbusiness.controller

import com.yourbusiness.dao.OperationDao
import com.yourbusiness.model.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class OperationController {

    @Autowired
    private val operationDao: OperationDao = OperationDao()

    @GetMapping("/operations/{id}") // GET
    fun getElement(@PathVariable id: String): Operation? {
        return operationDao.getElement(id)
    }

    @GetMapping("/operations") // GET
    fun getAll(): List<Operation> {
        return operationDao.getAll()
    }

    @PutMapping("/operations/{id}") // PUT
    fun update(@PathVariable id: String, @RequestBody operation: Operation) {
        return operationDao.update(id, operation)
    }

    @PostMapping("/operations") // POST
    fun save(@RequestBody operation: Operation) {
        return operationDao.save(operation)
    }

    @DeleteMapping("/operations/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return operationDao.delete(id)
    }

}
