package com.learn.kotlinbestpractices.chapter1

class ExtensionsFunctions {


}

data class Password(val password: String) {
    fun String.hidePassword() = "*".repeat(this.length)


    fun test(){
        val password: String = "secretpassword"
        println("Password: ${password.hidePassword()}")

    }

}
