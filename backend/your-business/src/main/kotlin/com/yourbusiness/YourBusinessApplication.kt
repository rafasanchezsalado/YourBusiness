package com.yourbusiness

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YourBusinessApplication

fun main(args: Array<String>) {
	runApplication<YourBusinessApplication>(*args)
}
