package com.learn.kotlinbestpractices.chapter1

import java.util.*

class Mutability {


    fun testList() {
        val hobbits = listOf("Frodo", "Sam", "Pippin", "Merry")

        // Acessando um elemento da lista:
        println(hobbits[1])

        // hobbits[0] = "Bilbo" // Unresolved reference! Não posso substituir nem acrescentar um elemento a lista

        // Editable collection types:

        // Dessa forma é possível modificar ou acrescentar elementos pois a lista é mutável:
        val editableHobbits = mutableListOf("Frodo", "Sam", "Pippin", "Merry")
        editableHobbits.add("Bilbo")


        // A principal característica de um TreeMap é que ele mantém os elementos sempre ordenados pelas chaves.
        // Mutable map sorted by its keys

        val treeMap = TreeMap(
            mapOf( //imutável
                "Practical Pig" to "bricks",
                "Fifer" to "straw",
                "Fiddler" to "sticks"
            )
        )
        println(treeMap.keys) //[Fiddler, Fifer, Practical Pig]
    }



}