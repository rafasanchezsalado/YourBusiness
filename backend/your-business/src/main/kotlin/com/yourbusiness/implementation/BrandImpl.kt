package com.yourbusiness.implementation

import com.yourbusiness.model.Brand
import com.yourbusiness.service.BrandService
import org.springframework.stereotype.Repository

@Repository
class BrandImpl(private val brandService: BrandService = BrandService()) {

    fun get(id: String): Brand? {
        return brandService.getBrand(id)
    }

    fun get(): List<Brand> {
        return brandService.getBrands()
    }

    fun update(brandRequest: Brand) {
        brandService.updateBrand(brandRequest)
    }

    fun update(brandsList: List<Brand>) {
        brandService.updateBrands(brandsList)
    }

    fun save(brandRequest: Brand) {
        brandService.insertBrand(brandRequest)
    }

    fun save(brandsList: List<Brand>) {
        brandService.insertBrands(brandsList)
    }

    fun delete(id: String) {
        brandService.deleteBrand(id)
    }

    fun delete(brandsList: List<Brand>) {
        brandService.deleteBrands(brandsList)
    }

}
