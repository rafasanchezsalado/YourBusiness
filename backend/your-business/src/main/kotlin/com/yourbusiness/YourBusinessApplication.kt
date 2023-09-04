package com.yourbusiness

import com.yourbusiness.controller.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YourBusinessApplication

fun main(args: Array<String>) {
    runApplication<YourBusinessApplication>(*args)
    initControllers()
}

fun initControllers() {
    BrandController()
    BusinessController()
    OperationController()
    ProductController()
    UserController()
}
