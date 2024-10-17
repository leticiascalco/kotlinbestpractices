package com.learn.kotlinbestpractices.chapter1

class Lists {

// Três grupos importantes de estruturas de dados:  lists, sets, e maps.
// Programação funcional: mutability e tuples

   // List: Uma coleção ordenada onde a posição dos elementos é importante.

    //Uma lista pode ser criada sem especificarmos explicitamente o tipo.
    // Isso se chama inferência de tipo

    fun testList() {
        val hobbits = listOf("Frodo", "Sam", "Pippin", "Merry")

        //Acessando um elemento da lista:
        println(hobbits[1])

    }

}