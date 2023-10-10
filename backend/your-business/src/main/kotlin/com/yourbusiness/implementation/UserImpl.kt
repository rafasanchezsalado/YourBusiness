package com.yourbusiness.implementation

import com.yourbusiness.model.User
import com.yourbusiness.service.UserService
import org.springframework.stereotype.Repository

@Repository
class UserImpl(private val userService: UserService = UserService()) {

    fun get(id: String): User? {
        return userService.getUser(id)
    }

    fun get(): List<User> {
        return userService.getUsers()
    }

    fun update(userRequest: User) {
        userService.updateUser(userRequest)
    }

    fun update(usersList: List<User>) {
        userService.updateUsers(usersList)
    }

    fun save(userRequest: User) {
        userService.insertUser(userRequest)
    }

    fun save(usersList: List<User>) {
        userService.insertUsers(usersList)
    }

    fun delete(id: String) {
        userService.deleteUser(id)
    }

    fun delete(usersList: List<User>) {
        userService.deleteUsers(usersList)
    }

}