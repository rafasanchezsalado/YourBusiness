package com.yourbusiness.implementation

import com.yourbusiness.model.Business
import com.yourbusiness.service.BusinessService
import org.springframework.stereotype.Repository

@Repository
class BusinessImpl(businessService: BusinessService) {

    private var business: Business = Business(name = "Business")

    fun getElement(id: String): Business {
        return business
    }

    fun getAll(): List<Business> {
        return listOf(business)
    }

    fun update(id: String, businessRequest: Business) {
        business = businessRequest
    }

    fun save(businessRequest: Business) {
        TODO("Not yet implemented")
    }

    fun delete(id: String) {
        business = Business()
    }

}
