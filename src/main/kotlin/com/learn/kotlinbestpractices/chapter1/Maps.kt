package com.learn.kotlinbestpractices.chapter1

class Maps {

    //É uma coleção que contém pares de chave-valor, com cada chave sendo única

    fun testMaps() {
        val movieBatmans = mapOf(
            "Batman Returns" to "Michael Keaton",
            "Batman Forever" to "Val Kilmer",
            "Batman & Robin" to "George Clooney"
        )
        println(movieBatmans) // {Batman Returns=Michael Keaton, Batman Forever=Val Kilmer, Batman & Robin=George Clooney}

        //acessando o valor:
        println(movieBatmans["Batman Returns"]) // Michael Keaton

        //verificando se o elemento existe:
        println("Batman Begins" in movieBatmans) //false


    }
}