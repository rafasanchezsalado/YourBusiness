package com.yourbusiness.dao

import com.yourbusiness.implementation.UserImpl
import com.yourbusiness.model.User

class UserDao(private val userImpl: UserImpl = UserImpl()) : Dao<User> {

    override fun get(id: String): User? {
        return userImpl.get(id)
    }

    override fun get(): List<User> {
        return userImpl.get()
    }

    override fun update(obj: User) {
        userImpl.update(obj)
    }

    override fun update(list: List<User>) {
        userImpl.update(list)
    }

    override fun save(obj: User) {
        userImpl.save(obj)
    }

    override fun save(list: List<User>) {
        userImpl.save(list)
    }

    override fun delete(id: String) {
        userImpl.delete(id)
    }

    override fun delete(list: List<User>) {
        userImpl.delete(list)
    }

}