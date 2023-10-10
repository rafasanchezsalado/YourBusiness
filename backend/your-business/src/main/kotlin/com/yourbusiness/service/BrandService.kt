package com.yourbusiness.service

import com.yourbusiness.model.Brand
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BrandService(private val jdbcTemplate: JdbcTemplate = JdbcTemplate()) {

    private val brand1: Brand = Brand(name = "brand1")
    private val brand2: Brand = Brand(name = "brand2")
    private val brand3: Brand = Brand(name = "brand3")
    private val brands: ArrayList<Brand> = arrayListOf(brand1, brand2, brand3)

    fun getBrand(id: String): Brand {
        return brands[Integer.valueOf(id)]
    }

    fun getBrands(): List<Brand> {
        return brands
    }

    fun insertBrand(brandRequest: Brand) {
        brands.add(brandRequest)
    }

    fun insertBrands(brandsList: List<Brand>) {
        // TODO
    }

    fun updateBrand(brandRequest: Brand) {
        // TODO
    }

    fun updateBrands(brandsList: List<Brand>) {
        // TODO
    }

    fun deleteBrand(id: String) {
        // TODO
    }

    fun deleteBrands(brandsList: List<Brand>) {
        // TODO
    }

    /*
    fun getBrand(id: String): Brand = db.query("select*  from messages where id = ?") { response, _ ->
        Brand(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }[0]


    fun getBrand(id: String): Brand {
        return db.queryForObject("select  *from messages where id = ?", Brand::class.java, id)
    }

    fun getBrands(): List<Brand> = db.query("select*  from brands") { response, _ ->
        Brand(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }

    fun insertBrand(id: String, name: String) {
        db.update("insert into brands values ( ?, ? )", id, name)
    }

    fun updateBrand(id: String, name: String) {
        db.update("update brands set name = ? where id = ?", name, id)
    }


    fun deleteBrand(id: String) {
        db.update("delete * from brands where id = ?", id)
    }
    */

}
