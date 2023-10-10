package com.yourbusiness.service

import com.yourbusiness.model.Operation
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class OperationService(private val jdbcTemplate: JdbcTemplate = JdbcTemplate()) {

    private val operation1: Operation = Operation()
    private val operation2: Operation = Operation()
    private val operation3: Operation = Operation()
    private val operations: ArrayList<Operation> = arrayListOf(operation1, operation2, operation3)

    fun getOperation(id: String): Operation {
        return operations[Integer.valueOf(id)]
    }

    fun getOperations(): List<Operation> {
        return operations
    }

    fun insertOperation(operationRequest: Operation) {
        operations.add(operationRequest)
    }

    fun insertOperations(operationsList: List<Operation>) {
        // TODO
    }

    fun updateOperation(operationRequest: Operation) {
        // TODO
    }

    fun updateOperations(operationsList: List<Operation>) {
        // TODO
    }

    fun deleteOperation(id: String) {
        // TODO
    }

    fun deleteOperations(operationsList: List<Operation>) {
        // TODO
    }

    /*
    fun getOperation(id: String): Operation = db.query("select*  from messages where id = ?") { response, _ ->
        Operation(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }[0]


    fun getOperation(id: String): Operation {
        return db.queryForObject("select  *from messages where id = ?", Operation::class.java, id)
    }

    fun getOperations(): List<Operation> = db.query("select*  from operations") { response, _ ->
        Operation(
            id = response.getString("id"),
            name = response.getString("name")
        )
    }

    fun insertOperation(id: String, name: String) {
        db.update("insert into operations values ( ?, ? )", id, name)
    }

    fun updateOperation(id: String, name: String) {
        db.update("update operations set name = ? where id = ?", name, id)
    }


    fun deleteOperation(id: String) {
        db.update("delete * from operations where id = ?", id)
    }
    */

}
