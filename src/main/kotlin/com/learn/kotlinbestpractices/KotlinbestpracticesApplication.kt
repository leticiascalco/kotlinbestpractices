package com.learn.kotlinbestpractices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinbestpracticesApplication

fun main(args: Array<String>) {
	runApplication<KotlinbestpracticesApplication>(*args)
	println("Hello Kotlin")
	var greeting = "Hello Kotlin"

//	greeting = 1 // <- Greeting is a String

	var greeting2: String = "Hello Kotlin"

	println(greeting2)


}
