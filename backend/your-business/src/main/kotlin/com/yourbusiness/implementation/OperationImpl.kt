package com.yourbusiness.implementation

import com.yourbusiness.model.Operation
import com.yourbusiness.service.OperationService
import org.springframework.stereotype.Repository

@Repository
class OperationImpl(private val operationService: OperationService = OperationService()) {

    fun get(id: String): Operation? {
        return operationService.getOperation(id)
    }

    fun get(): List<Operation> {
        return operationService.getOperations()
    }

    fun update(operationRequest: Operation) {
        operationService.updateOperation(operationRequest)
    }

    fun update(operationsList: List<Operation>) {
        operationService.updateOperations(operationsList)
    }

    fun save(operationRequest: Operation) {
        operationService.insertOperation(operationRequest)
    }

    fun save(operationsList: List<Operation>) {
        operationService.insertOperations(operationsList)
    }

    fun delete(id: String) {
        operationService.deleteOperation(id)
    }

    fun delete(operationsList: List<Operation>) {
        operationService.deleteOperations(operationsList)
    }

}
