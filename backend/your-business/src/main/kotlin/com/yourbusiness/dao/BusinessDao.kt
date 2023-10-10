package com.yourbusiness.dao

import com.yourbusiness.implementation.BusinessImpl
import com.yourbusiness.model.Business

class BusinessDao(private val businessImpl: BusinessImpl = BusinessImpl()) : Dao<Business> {

    override fun get(id: String): Business? {
        return businessImpl.get(id)
    }

    override fun get(): List<Business> {
        return businessImpl.get()
    }

    override fun update(obj: Business) {
        businessImpl.update(obj)
    }

    override fun update(list: List<Business>) {
        businessImpl.update(list)
    }

    override fun save(obj: Business) {
        businessImpl.save(obj)
    }

    override fun save(list: List<Business>) {
        businessImpl.save(list)
    }

    override fun delete(id: String) {
        businessImpl.delete(id)
    }

    override fun delete(list: List<Business>) {
        businessImpl.delete(list)
    }

}
