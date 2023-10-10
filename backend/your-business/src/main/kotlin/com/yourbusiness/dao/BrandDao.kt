package com.yourbusiness.dao

import com.yourbusiness.implementation.BrandImpl
import com.yourbusiness.model.Brand

class BrandDao(private val brandImpl: BrandImpl = BrandImpl()) : Dao<Brand> {

    override fun get(id: String): Brand? {
        return brandImpl.get(id)
    }

    override fun get(): List<Brand> {
        return brandImpl.get()
    }

    override fun update(obj: Brand) {
        brandImpl.update(obj)
    }

    override fun update(list: List<Brand>) {
        brandImpl.update(list)
    }

    override fun save(obj: Brand) {
        brandImpl.save(obj)
    }

    override fun save(list: List<Brand>) {
        brandImpl.save(list)
    }

    override fun delete(id: String) {
        brandImpl.delete(id)
    }

    override fun delete(list: List<Brand>) {
        brandImpl.delete(list)
    }

}