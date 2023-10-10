package com.yourbusiness.dao

import com.yourbusiness.implementation.OperationImpl
import com.yourbusiness.model.Operation

class OperationDao(private val operationImpl: OperationImpl = OperationImpl()) : Dao<Operation> {

    override fun get(id: String): Operation? {
        return operationImpl.get(id)
    }

    override fun get(): List<Operation> {
        return operationImpl.get()
    }

    override fun update(obj: Operation) {
        operationImpl.update(obj)
    }

    override fun update(list: List<Operation>) {
        operationImpl.update(list)
    }

    override fun save(obj: Operation) {
        operationImpl.save(obj)
    }

    override fun save(list: List<Operation>) {
        operationImpl.save(list)
    }

    override fun delete(id: String) {
        operationImpl.delete(id)
    }

    override fun delete(list: List<Operation>) {
        operationImpl.delete(list)
    }

}