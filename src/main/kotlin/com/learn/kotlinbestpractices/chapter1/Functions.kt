package com.learn.kotlinbestpractices.chapter1

class Functions {

    fun greet(greeting: String){
        println(greeting)
    }

    fun getGreeting(): String {
        return "Hello, Kotlin!"
    }

    //Single-expression function/ função de expressão única.
    fun getGreeting2() = "Hello, Kotlin"


}