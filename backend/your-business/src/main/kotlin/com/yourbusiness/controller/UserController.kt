package com.yourbusiness.controller

import com.yourbusiness.dao.UserDao
import com.yourbusiness.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    val userDao: UserDao = UserDao()

    @GetMapping("/users/{id}") // GET
    fun getElement(@PathVariable id: String): User? {
        return userDao.getElement(id)
    }

    @GetMapping("/users") // GET
    fun getAll(): List<User> {
        return userDao.getAll()
    }

    @PutMapping("/users/{id}") // PUT
    fun update(@PathVariable id: String, @RequestBody user: User) {
        return userDao.update(id, user)
    }

    @PostMapping("/users") // POST
    fun save(@RequestBody user: User) {
        return userDao.save(user)
    }

    @DeleteMapping("/users/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return userDao.delete(id)
    }

}
