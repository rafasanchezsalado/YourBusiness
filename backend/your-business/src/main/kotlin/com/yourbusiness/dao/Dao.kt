package com.yourbusiness.dao

interface Dao<T> {
    fun get(id: String): T?
    fun get(): List<T>
    fun save(obj: T)
    fun save(list: List<T>)
    fun update(obj: T)
    fun update(list: List<T>)
    fun delete(id: String)
    fun delete(list: List<T>)
}