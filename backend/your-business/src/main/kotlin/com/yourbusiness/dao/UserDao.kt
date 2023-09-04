package com.yourbusiness.dao

import com.yourbusiness.implementation.UserImpl
import com.yourbusiness.model.User
import com.yourbusiness.service.UserService
import org.springframework.jdbc.core.JdbcTemplate

class UserDao : Dao<User> {

    private val userImpl: UserImpl = UserImpl(UserService(JdbcTemplate()))

    override fun getElement(id: String): User? {
        return userImpl.getElement(id)
    }

    override fun getAll(): List<User> {
        return userImpl.getAll()
    }

    override fun update(id: String, obj: User) {
        userImpl.update(id, obj)
    }

    override fun save(obj: User) {
        userImpl.save(obj)
    }

    override fun delete(id: String) {
        userImpl.delete(id)
    }

}
