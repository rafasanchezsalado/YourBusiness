package com.yourbusiness.controller

import com.yourbusiness.dao.UserDao
import com.yourbusiness.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController(@Autowired val userDao: UserDao = UserDao()) {

    @GetMapping("/users/{id}") // GET
    fun getElement(@PathVariable id: String): User? {
        return userDao.get(id)
    }

    @GetMapping("/users") // GET
    fun getAll(): List<User> {
        return userDao.get()
    }

    @PutMapping("/users") // PUT
    fun updateElement(@RequestBody user: User) {
        return userDao.update(user)
    }

    @PutMapping("/users/list") // PUT
    fun updateList(@RequestBody users: List<User>) {
        return userDao.update(users)
    }

    @PostMapping("/users") // POST
    fun saveElement(@RequestBody user: User) {
        return userDao.save(user)
    }

    @PostMapping("/users/list") // POST
    fun saveList(@RequestBody users: List<User>) {
        return userDao.save(users)
    }

    @DeleteMapping("/users/{id}") // DELETE
    fun delete(@PathVariable id: String) {
        return userDao.delete(id)
    }

    @DeleteMapping("/users") // DELETE
    fun deleteAll(@RequestBody users: List<User>) {
        return userDao.delete(users)
    }

}