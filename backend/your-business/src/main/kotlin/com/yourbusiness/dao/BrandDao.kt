package com.yourbusiness.dao

import com.yourbusiness.implementation.BrandImpl
import com.yourbusiness.model.Brand
import com.yourbusiness.service.BrandService
import org.springframework.jdbc.core.JdbcTemplate

class BrandDao : Dao<Brand> {

    private val brandImpl: BrandImpl =
        BrandImpl(BrandService(JdbcTemplate()))

    override fun getElement(id: String): Brand? {
        return brandImpl.getElement(id)
    }

    override fun getAll(): List<Brand> {
        return brandImpl.getAll()
    }

    override fun update(id: String, obj: Brand) {
        brandImpl.update(id, obj)
    }

    override fun save(obj: Brand) {
        brandImpl.save(obj)
    }

    override fun delete(id: String) {
        brandImpl.delete(id)
    }

}
