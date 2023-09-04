package com.yourbusiness.implementation

import com.yourbusiness.model.Operation
import com.yourbusiness.service.OperationService
import org.springframework.stereotype.Repository

@Repository
class OperationImpl(operationService: OperationService) {

    private val operation1: Operation = Operation()
    private val operation2: Operation = Operation()
    private val operation3: Operation = Operation()
    private val operations: ArrayList<Operation> = arrayListOf(operation1, operation2, operation3)

    fun getElement(id: String): Operation? {
        return operations.find { operation: Operation -> operation.id == id }
    }

    fun getAll(): List<Operation> {
        return operations
    }

    fun update(id: String, operationRequest: Operation) {
        val operation: Operation? = operations.find { operation: Operation -> operation.id == id }
        operations[operations.indexOf(operation)] = operationRequest
    }

    fun save(operationRequest: Operation) {
        operations.add(operationRequest)
    }

    fun delete(id: String) {
        operations.remove(operations.find { operation: Operation -> operation.id == id })
    }

}
