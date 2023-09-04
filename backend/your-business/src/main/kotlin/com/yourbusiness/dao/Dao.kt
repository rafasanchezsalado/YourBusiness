package com.yourbusiness.dao

interface Dao<T> {
    fun getElement(id: String): T?
    fun getAll(): List<T>
    fun save(obj: T)
    fun update(id: String, obj: T)
    fun delete(id: String)
}