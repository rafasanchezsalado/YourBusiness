package com.yourbusiness.implementation

import com.yourbusiness.model.Business
import com.yourbusiness.service.BusinessService
import org.springframework.stereotype.Repository

@Repository
class BusinessImpl(private val businessService: BusinessService = BusinessService()) {

    fun get(id: String): Business? {
        return businessService.getBusiness(id)
    }

    fun get(): List<Business> {
        return businessService.getBusiness()
    }

    fun update(businessRequest: Business) {
        businessService.updateBusiness(businessRequest)
    }

    fun update(businessList: List<Business>) {
        businessService.updateBusiness(businessList)
    }

    fun save(businessRequest: Business) {
        businessService.insertBusiness(businessRequest)
    }

    fun save(businessList: List<Business>) {
        businessService.insertBusiness(businessList)
    }

    fun delete(id: String) {
        businessService.deleteBusiness(id)
    }

    fun delete(businessList: List<Business>) {
        businessService.deleteBusiness(businessList)
    }

}
