package com.yourbusiness.service

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BrandService(jdbcTemplate: JdbcTemplate) {

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
