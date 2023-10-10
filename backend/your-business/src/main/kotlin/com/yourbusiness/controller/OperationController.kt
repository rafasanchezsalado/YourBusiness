package com.yourbusiness.controller

import com.yourbusiness.dao.OperationDao
import com.yourbusiness.model.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class OperationController(@Autowired val operationDao: OperationDao = OperationDao()) {

    @GetMapping("/operations/{id}") // GET
    fun getElement(@PathVariable id: String): Operation? {
        return operationDao.get(id)
    }

    @GetMapping("/operations") // GET
    fun getAll(): List<Operation> {
        return operationDao.get()
    }

    @PutMapping("/operations") // PUT
    fun updateElement(@RequestBody operation: Operation) {
        return operationDao.update(operation)
    }

    @PutMapping("/operations/list") // PUT
    fun updateList(@RequestBody operations: List<Operation>) {
        return operationDao.update(operations)
    }

    @PostMapping("/operations") // POST
    fun saveElement(@RequestBody operation: Operation) {
        return operationDao.save(operation)
    }

    @PostMapping("/operations/list") // POST
    fun saveList(@RequestBody operations: List<Operation>) {
        return operationDao.save(operations)
    }

    @DeleteMapping("/operations/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return operationDao.delete(id)
    }

    @DeleteMapping("/operations") // DELETE
    fun deleteAll(@RequestBody operations: List<Operation>) {
        return operationDao.delete(operations)
    }

}