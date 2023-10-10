package com.yourbusiness.service

import com.yourbusiness.model.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class UserService(private val jdbcTemplate: JdbcTemplate = JdbcTemplate()) {

    private val user1: User = User(name = "user1")
    private val user2: User = User(name = "user2")
    private val user3: User = User(name = "user3")
    private val users: ArrayList<User> = arrayListOf(user1, user2, user3)

    fun getUser(id: String): User {
        return users[Integer.valueOf(id)]
    }

    fun getUsers(): List<User> {
        return users
    }

    fun insertUser(userRequest: User) {
        users.add(userRequest)
    }

    fun insertUsers(usersList: List<User>) {
        // TODO
    }

    fun updateUser(userRequest: User) {
        // TODO
    }

    fun updateUsers(usersList: List<User>) {
        // TODO
    }

    fun deleteUser(id: String) {
        // TODO
    }

    fun deleteUsers(usersList: List<User>) {
        // TODO
    }

    /*
    fun getUser(id: String): User = db.query("select*  from messages where id = ?") { response, _ ->
        User(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }[0]


    fun getUser(id: String): User {
        return db.queryForObject("select  *from messages where id = ?", User::class.java, id)
    }

    fun getUsers(): List<User> = db.query("select*  from users") { response, _ ->
        User(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }

    fun insertUser(id: String, name: String) {
        db.update("insert into users values ( ?, ? )", id, name)
    }

    fun updateUser(id: String, name: String) {
        db.update("update users set name = ? where id = ?", name, id)
    }


    fun deleteUser(id: String) {
        db.update("delete * from users where id = ?", id)
    }
    */

}