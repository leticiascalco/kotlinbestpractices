package com.learn.kotlinbestpractices.chapter1

class DataClass {
}

data class User(val username: String, private val password: String) {
    fun hidePassword() = "*".repeat(password.length)


}

@JvmRecord
data class User2(val username: String, val password: String)


fun testUser(){
    val user = User("Alexey", "abcd1234")
    println(user.hidePassword()) // ********
}


