package com.yourbusiness.implementation

import com.yourbusiness.model.Brand
import com.yourbusiness.service.BrandService
import org.springframework.stereotype.Repository

@Repository
class BrandImpl(brandService: BrandService) {

    private val brand1: Brand = Brand(name = "brand1")
    private val brand2: Brand = Brand(name = "brand2")
    private val brand3: Brand = Brand(name = "brand3")
    private val brands: ArrayList<Brand> = arrayListOf(brand1, brand2, brand3)

    fun getElement(id: String): Brand? {
        return brands.find { brand: Brand -> brand.id == id }
    }

    fun getAll(): List<Brand> {
        return brands
    }

    fun update(id: String, brandRequest: Brand) {
        val brand: Brand? = brands.find { brand: Brand -> brand.id == id }
        brands[brands.indexOf(brand)] = brandRequest
    }

    fun save(brandRequest: Brand) {
        brands.add(brandRequest)
    }
    fun delete(id: String) {
        brands.remove(brands.find { brand: Brand -> brand.id == id })
    }

}
