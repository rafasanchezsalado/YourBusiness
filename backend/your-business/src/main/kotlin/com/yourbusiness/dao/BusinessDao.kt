package com.yourbusiness.dao

import com.yourbusiness.implementation.BusinessImpl
import com.yourbusiness.model.Business
import com.yourbusiness.service.BusinessService
import org.springframework.jdbc.core.JdbcTemplate

class BusinessDao : Dao<Business> {

    private val businessImpl: BusinessImpl = BusinessImpl(BusinessService(JdbcTemplate()))

    override fun getElement(id: String): Business {
        return businessImpl.getElement(id)
    }

    override fun getAll(): List<Business> {
        return businessImpl.getAll()
    }

    override fun update(id: String, obj: Business) {
        businessImpl.update(id, obj)
    }

    override fun save(obj: Business) {
        businessImpl.save(obj)
    }

    override fun delete(id: String) {
        businessImpl.delete(id)
    }

}
