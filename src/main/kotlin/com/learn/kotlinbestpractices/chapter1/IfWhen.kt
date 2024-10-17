package com.learn.kotlinbestpractices.chapter1

class IfWhen {

    //Expressões condicionais: If e When. No Kotlin, sua instrução if é uma expressão que retorna um valor.

    fun getUnixSocketPolling(isBsd: Boolean): String {
        return if (isBsd) {
            "kqueue"
        } else {
            "epoll"
        }
    }

    // De forma mais concisa
    fun getUnixSocketPolling2(isBsd: Boolean): String = if (isBsd) "kqueue" else "epoll"


    // When
    fun archenemy(heroName: String) = when (heroName) {
        "Batman" -> "Joker"
        "Superman" -> "Lex Luthor"
        "Spider-Man" -> "Green Goblin"
        else -> "Sorry, no idea"
    }

}