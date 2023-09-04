package com.yourbusiness.dao

import com.yourbusiness.implementation.OperationImpl
import com.yourbusiness.model.Operation
import com.yourbusiness.service.OperationService
import org.springframework.jdbc.core.JdbcTemplate

class OperationDao : Dao<Operation> {

    private val operationImpl: OperationImpl = OperationImpl(OperationService(JdbcTemplate()))

    override fun getElement(id: String): Operation? {
        return operationImpl.getElement(id)
    }

    override fun getAll(): List<Operation> {
        return operationImpl.getAll()
    }

    override fun update(id: String, obj: Operation) {
        operationImpl.update(id, obj)
    }

    override fun save(obj: Operation) {
        operationImpl.save(obj)
    }

    override fun delete(id: String) {
        operationImpl.delete(id)
    }

}
