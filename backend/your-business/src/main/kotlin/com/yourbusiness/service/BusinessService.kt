package com.yourbusiness.service

import com.yourbusiness.model.Business
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class BusinessService(private val jdbcTemplate: JdbcTemplate = JdbcTemplate()) {

    private val business1: Business = Business(name = "business1")
    private val business2: Business = Business(name = "business2")
    private val business3: Business = Business(name = "business3")
    private val businessList: ArrayList<Business> = arrayListOf(business1, business2, business3)

    fun getBusiness(id: String): Business {
        return businessList[Integer.valueOf(id)]
    }

    fun getBusiness(): List<Business> {
        return businessList
    }

    fun insertBusiness(businessRequest: Business) {
        businessList.add(businessRequest)
    }

    fun insertBusiness(businessList: List<Business>) {
        // TODO
    }

    fun updateBusiness(businessRequest: Business) {
        // TODO
    }

    fun updateBusiness(businessList: List<Business>) {
        // TODO
    }

    fun deleteBusiness(id: String) {
        // TODO
    }

    fun deleteBusiness(businessList: List<Business>) {
        // TODO
    }

    /*
    fun getBusiness(id: String): Business = db.query("select*  from messages where id = ?") { response, _ ->
        Business(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }[0]


    fun getBusiness(id: String): Business {
        return db.queryForObject("select  *from messages where id = ?", Business::class.java, id)
    }

    fun getBusiness(): List<Business> = db.query("select*  from business") { response, _ ->
        Business(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }

    fun insertBusiness(id: String, name: String) {
        db.update("insert into business values ( ?, ? )", id, name)
    }

    fun updateBusiness(id: String, name: String) {
        db.update("update business set name = ? where id = ?", name, id)
    }


    fun deleteBusiness(id: String) {
        db.update("delete * from business where id = ?", id)
    }
    */
}