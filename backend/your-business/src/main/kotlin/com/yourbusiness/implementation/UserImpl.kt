package com.yourbusiness.implementation

import com.yourbusiness.model.User
import com.yourbusiness.service.UserService
import org.springframework.stereotype.Repository

@Repository
class UserImpl(userService: UserService) {

    private val user1: User = User()
    private val user2: User = User()
    private val user3: User = User()
    private val users: ArrayList<User> = arrayListOf(user1, user2, user3)

    fun getElement(id: String): User? {
        return users.find { user: User -> user.id == id }
    }

    fun getAll(): List<User> {
        return users
    }

    fun update(id: String, userRequest: User) {
        val user: User? = users.find { user: User -> user.id == id }
        users[users.indexOf(user)] = userRequest
    }

    fun save(userRequest: User) {
        users.add(userRequest)
    }

    fun delete(id: String) {
        users.remove(users.find { user: User -> user.id == id })
    }

}