package com.learn.kotlinbestpractices.chapter1

class Sets {
//Representa uma coleção de elementos únicos. Isso significa que um conjunto não conterá nenhuma duplicata.

    fun testSets(){
        val footballChampions = setOf("Brazil", "France", "Brazil", "Italy", "Spain", "Germany", "France")
        println(footballChampions) // [France, Germany, Spain, Italy, Brazil] removendo o duplicado

        /**
         * Para verificar se um elemento está presente em um conjunto, podemos usar a função in:
         */
        println("Israel" in footballChampions) //false
        println("Italy" in footballChampions) //true

        //*** O setOf retorna uma LinkedHashSet, preservando a ordem de inserção dos elemtentos.

    }
}


