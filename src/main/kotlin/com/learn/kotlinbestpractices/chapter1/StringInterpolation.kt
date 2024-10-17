package com.learn.kotlinbestpractices.chapter1

class StringInterpolation {

    fun archenemy(heroName: String) = when (heroName) {
        "Batman" -> "Joker"
        "Superman" -> "Lex Luthor"
        "Spider-Man" -> "Green Goblin"
        else -> "Sorry, no idea"
    }

    fun testString(){
        val hero = "Batman"
        println("Archenemy of $hero is ${archenemy(hero)}") //Archenemy of Batman is Joker

        println("Twinkle, Twinkle Little Bat\n" +
                "How I wonder what you're at!\n" +
                "Up above the world you fly,\n" +
                "Like a tea tray in the sky.\n" +
                "Twinkle, twinkle, little bat!\n" +
                "How I wonder what you're at!")

        // Usando aspas triplas:
        println("""Twinkle, Twinkle Little Bat
            How I wonder what you're at!
            Up above the world you fly,
            Like a tea tray in the sky.
            Twinkle, twinkle, little bat!
            How I wonder what you're at!""")

        // Para garantir o recuo adequado ao imprimir os resultados, podemos invocar a função trimIndent():
        println("""
            Twinkle, Twinkle Little Bat
            How I wonder what you're at!
            """.trimIndent())


        println("From \"Alice's Adventures in Wonderland\"")

    }




}